package se.newmarksaur.model;

import java.util.Map;

public class RecommendedAge {
	private int boxRecommendation;
	private Map<Integer, Integer> pollingResults;

	public int getBoxRecommendation() {
		return boxRecommendation;
	}

	public void setBoxRecommendation(int boxRecommendation) {
		this.boxRecommendation = boxRecommendation;
	}

	public Map<Integer, Integer> getPollingResults() {
		return pollingResults;
	}

	public void setPollingResults(Map<Integer, Integer> pollingResults) {
		this.pollingResults = pollingResults;
	}
}
