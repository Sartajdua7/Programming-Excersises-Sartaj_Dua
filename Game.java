package homework;

public class Game {
	private int blueAllianceScore;
	private int redAllianceScore;
	public Game() {}
	public Game(int blueAllianceScore, int redAllianceScore) {
		this.blueAllianceScore = blueAllianceScore;
		this.redAllianceScore = redAllianceScore;
	}

	public int getBlueAllianceScore() {
		return blueAllianceScore;
	}

	public void setBlueAllianceScore(int blueAllianceScore) {
		this.blueAllianceScore = blueAllianceScore;
	}

	public int getRedAllianceScore() {
		return redAllianceScore;
	}

	public void setRedAllianceScore(int redAllianceScore) {
		this.redAllianceScore = redAllianceScore;
	}
	
	
}
