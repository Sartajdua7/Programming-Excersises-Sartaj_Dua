package homework;

public class FRCRobot {
private String name;
private double weight;
public final int MAX_WEIGHT = 120;
private FRCGame[] games;

public FRCRobot() {}

public FRCRobot(String name, double weight) {
	this.name = name;
	this.weight = weight;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}


public Game[] getGames() {
	return games;
}


public void setGames(FRCGame[] games) {
	this.games = games;
} 
}
