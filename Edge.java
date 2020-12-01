import java.util.*;

public class Edge{

	String startingpoint;
	String endingPoint;
	int distanceMile; 
	int distanceMin;
	Edge path;
	int cost;
	boolean known;
	List<String> attractions;
	
	public Edge(String startingpoint, String endingPoint, int distanceMile, int distanceMin, List<String>attractions){

		this.path = path;
		this.cost = -1;
		this.known = false;
		this.startingpoint = startingpoint;
		this.endingPoint = endingPoint;
		this.distanceMile = distanceMile;
		this.distanceMin = distanceMin;
		this.attractions = attractions;

	}

	public String getStartingPoint(){

		return this.startingpoint;

	}

	public String getEndingPoint(){

		return this.endingPoint;

	}

	public int getDistanceMile(){

		return this.distanceMile;
	}

	public int getDistanceMin(){

		return this.distanceMin;

	}
	public Edge getPath(){

		return this.path;

	}

	public void updatePath(Edge path){

		this.path = path;


	}

	public int getCost(){

		return this.cost;

	}
	public void setCost(int cost){

		this.cost = cost;


	}

	boolean isKnown(){

		return this.known;
	}
	boolean knownTrue(){

		return this.known = true;
	}

	int updateDistance(Edge source, Edge destination, int distance){
		return this.getDistanceMile() + distance;



	}















}