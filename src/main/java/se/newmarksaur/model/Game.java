package se.newmarksaur.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Game {
	private int objectId;
	private int yearPublished;
	private Players players =  new Players();
	private PlayingTime playingTime = new PlayingTime();
	private RecommendedAge recommendedAge = new RecommendedAge();
	private String name = "";
	private Set<String> alternateNames;
	private String description = "";
	private String image = "";
	private String thumbnail = "";
	private List<BGGObject> honors;
	private List<BGGObject> publishers;
	private List<BGGObject> podcastEpisodes;
	private List<BGGObject> videoGames;
	private List<BGGObject> implementation;
	private List<BGGObject> expansions;
	private List<BGGObject> accessories;
	private List<BGGObject> versions;
	private List<BGGObject> mechanics;
	private List<BGGObject> categories;
	private List<BGGObject> designers;
	private List<BGGObject> artists;
	private List<BGGObject> subdomains;
	private List<BGGObject> families;
	private Map<String, Integer> languageDependence;

	public Game(int objectId) {
		this.objectId = objectId;
	}

	public int getObjectId() {
		return objectId;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public Players getPlayers() {
		return players;
	}

	public void setMinPlayers(int min) {
		players.setMin(min);
	}

	public void setMaxPlayers(int min) {
		players.setMin(min);
	}

	public PlayingTime getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(PlayingTime playingTime) {
		this.playingTime = playingTime;
	}

	public RecommendedAge getRecommendedAge() {
		return recommendedAge;
	}

	public void setRecommendedAge(RecommendedAge recommendedAge) {
		this.recommendedAge = recommendedAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAlternateNames() {
		return alternateNames;
	}

	public void setAlternateNames(Set<String> alternateNames) {
		this.alternateNames = alternateNames;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public List<BGGObject> getHonors() {
		return honors;
	}

	public void setHonors(List<BGGObject> honors) {
		this.honors = honors;
	}

	public List<BGGObject> getPublishers() {
		return publishers;
	}

	public void setPublishers(List<BGGObject> publishers) {
		this.publishers = publishers;
	}

	public List<BGGObject> getPodcastEpisodes() {
		return podcastEpisodes;
	}

	public void setPodcastEpisodes(List<BGGObject> podcastEpisodes) {
		this.podcastEpisodes = podcastEpisodes;
	}

	public List<BGGObject> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<BGGObject> videoGames) {
		this.videoGames = videoGames;
	}

	public List<BGGObject> getImplementation() {
		return implementation;
	}

	public void setImplementation(List<BGGObject> implementation) {
		this.implementation = implementation;
	}

	public List<BGGObject> getExpansions() {
		return expansions;
	}

	public void setExpansions(List<BGGObject> expansions) {
		this.expansions = expansions;
	}

	public List<BGGObject> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<BGGObject> accessories) {
		this.accessories = accessories;
	}

	public List<BGGObject> getVersions() {
		return versions;
	}

	public void setVersions(List<BGGObject> versions) {
		this.versions = versions;
	}

	public List<BGGObject> getMechanics() {
		return mechanics;
	}

	public void setMechanics(List<BGGObject> mechanics) {
		this.mechanics = mechanics;
	}

	public List<BGGObject> getCategories() {
		return categories;
	}

	public void setCategories(List<BGGObject> categories) {
		this.categories = categories;
	}

	public List<BGGObject> getDesigners() {
		return designers;
	}

	public void setDesigners(List<BGGObject> designers) {
		this.designers = designers;
	}

	public List<BGGObject> getArtists() {
		return artists;
	}

	public void setArtists(List<BGGObject> artists) {
		this.artists = artists;
	}

	public List<BGGObject> getSubdomains() {
		return subdomains;
	}

	public void setSubdomains(List<BGGObject> subdomains) {
		this.subdomains = subdomains;
	}

	public List<BGGObject> getFamilies() {
		return families;
	}

	public void setFamilies(List<BGGObject> families) {
		this.families = families;
	}

	public Map<String, Integer> getLanguageDependence() {
		return languageDependence;
	}

	public void setLanguageDependence(Map<String, Integer> languageDependence) {
		this.languageDependence = languageDependence;
	}
}
