package se.newmarksaur.xml;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.eclipse.jetty.util.resource.Resource;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParseTest {
	static final Logger log = LoggerFactory.getLogger(XmlParseTest.class);

	@Test
	public void testParseOwned() {
		try (Resource ownedGames = Resource.newClassPathResource("/OwnedGames.xml")) {
			if (ownedGames == null) {
				fail("Failed to get file");
			}
			OwnedListReader reader = new OwnedListReader(ownedGames.getFile());
			Document doc = reader.getmDoc();
			doc.getDocumentElement().normalize();
			log.info("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList childNodes = doc.getDocumentElement().getElementsByTagName("item");
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node nNode = childNodes.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Element name = (Element) eElement.getElementsByTagName("name").item(0);

//					String objectId = eElement.getAttribute("objectid");
					log.info(name.getTextContent());
				}

			}
		}
		catch (IOException e) {
			fail("Failed to get file");
		}
	}

	@Test
	public void testParseGames() {
		try (Resource games = Resource.newClassPathResource("/GameList.xml")) {
			if (games == null) {
				fail("Failed to get file");
			}
			GameListReader reader = new GameListReader(games.getFile());
			Document doc = reader.getmDoc();
			doc.getDocumentElement().normalize();
			log.info("Root element :" + doc.getDocumentElement().getNodeName());
		}
		catch (IOException e) {
			fail("Failed to get file");
		}
	}
}
