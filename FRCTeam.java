package homework;

public class FRCTeam {
	private FRCRobot obj;
	
	public FRCTeam(FRCRobot obj) {
		this.obj = obj;
	}
public int getAverageScore() {
	int total = 0;
	for(int i = 0; i < obj.getGames().length; i++) {
		if(obj.getGames()[i].isBlueAlliance()) {
			total += obj.getGames()[i].getBlueAllianceScore();
		}
		if(obj.getGames()[i].isRedAlliance()) {
			total += obj.getGames()[i].getRedAllianceScore();
		}
	}
	 double average = ((double) total)/(double) obj.getGames().length;
	average = Math.round(average);
	int average1 = (int) average;
	return average1;
}
}
