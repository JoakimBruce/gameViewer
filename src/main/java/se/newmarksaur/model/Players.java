package se.newmarksaur.model;

import java.util.HashMap;
import java.util.Map;

public class Players {
	private int min;
	private int max;
	private Map<Integer, VoteRecommendations> pollResults = new HashMap<>();

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Map<Integer, VoteRecommendations> getPollResults() {
		return pollResults;
	}

	public void addPollResult(int playerNumber, int best, int recommended, int notRecommended) {
		pollResults.put(playerNumber, new VoteRecommendations(best, recommended, notRecommended));
	}

	class VoteRecommendations {
		private int best;
		private int recommended;
		private int notRecommended;

		public VoteRecommendations(int best, int recommended, int notRecommended) {
			this.best = best;
			this.recommended = recommended;
			this.notRecommended = notRecommended;
		}

		public int getBest() {
			return best;
		}

		public void setBest(int best) {
			this.best = best;
		}

		public int getRecommended() {
			return recommended;
		}

		public void setRecommended(int recommended) {
			this.recommended = recommended;
		}

		public int getNotRecommended() {
			return notRecommended;
		}

		public void setNotRecommended(int notRecommended) {
			this.notRecommended = notRecommended;
		}
	}
}
