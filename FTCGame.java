package homework;

public class FTCGame extends Game{ 
	
	private FRCRobot red1;
	private FRCRobot red2;
	private FRCRobot blue1;
	private FRCRobot blue2;
	
	public FTCGame(int blueAllianceScore, int redAllianceScore, FRCRobot red1, FRCRobot red2, FRCRobot blue1, FRCRobot blue2) {
		super(blueAllianceScore, redAllianceScore);
		this.red1 = red1;
		this.red2 = red2;
		this.blue1 = blue1;
		this.blue2 = blue2;
	}

}
