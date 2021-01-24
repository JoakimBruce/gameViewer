package se.newmarksaur.xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class GameListReader {
	private Document mDoc;

	public Document getmDoc() {
		return mDoc;
	}

	public GameListReader(File xmlFile) {
		try {
			mDoc = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().parse(xmlFile);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getOwnedGames() {
		return "";
	}


}
