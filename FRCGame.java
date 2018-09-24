package homework;

public class FRCGame extends Game{
	private FRCRobot red1;
	private FRCRobot red2;
	private FRCRobot red3;
	private FRCRobot blue1;
	private FRCRobot blue2;
	private FRCRobot blue3;
	
	public FRCGame(int blueAllianceSocre, int redAllianceScore, FRCRobot red1, FRCRobot red2, FRCRobot red3, FRCRobot blue1, FRCRobot blue2, FRCRobot blue3) {
		super(blueAllianceSocre, redAllianceScore);
		this.red1 = red1;
		this.red2 = red2;
		this.red3 = red3;
		this.blue1 = blue1;
		this.blue2 = blue2;
		this.blue3 = blue3;
	
	}
	
	public boolean isBlueAlliance(FRCRobot x) {
		String tester = x.getName().substring(0, 4);
		if(tester.equals("blue")) {
			return true;
		}
		return false;
	}
	
	public boolean isRedAlliance(FRCRobot x) {
		String tester = x.getName().substring(0, 3);
		if(tester.equals("red")) {
			return true;
		}
		return false;
	}
	
	public int getAllianceScore(FRCRobot x) {
		if(isRedAlliance(x)) {
			return getRedAllianceScore();
		}
		if(isBlueAlliance(x)) {
			return getBlueAllianceScore();
		}
		return -1;
	}

	public FRCRobot getRed1() {
		return red1;
	}

	public void setRed1(FRCRobot red1) {
		this.red1 = red1;
	}

	public FRCRobot getRed2() {
		return red2;
	}

	public void setRed2(FRCRobot red2) {
		this.red2 = red2;
	}

	public FRCRobot getRed3() {
		return red3;
	}

	public void setRed3(FRCRobot red3) {
		this.red3 = red3;
	}

	public FRCRobot getBlue1() {
		return blue1;
	}

	public void setBlue1(FRCRobot blue1) {
		this.blue1 = blue1;
	}

	public FRCRobot getBlue2() {
		return blue2;
	}

	public void setBlue2(FRCRobot blue2) {
		this.blue2 = blue2;
	}

	public FRCRobot getBlue3() {
		return blue3;
	}

	public void setBlue3(FRCRobot blue3) {
		this.blue3 = blue3;
	}

}
