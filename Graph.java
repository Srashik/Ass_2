import java.util.*;
import java.io.File;

public class Graph{

	
	List<String> attractions;
	List<Edge> settled;
	List<Edge> unsettled;
	String starting_city;
	String ending_city;
	List<String>touristStops;
	List<Edge>edges;
	boolean known;






	public Graph(List<String>touristStops,List<Edge> edges){

		this.edges = edges;
		this.known = false;
		settled = new ArrayList<Edge>();
		unsettled = new ArrayList<Edge>();
		this.touristStops = touristStops;
		
		
	}

	Edge leastCostUnknownVertex(){
		Edge e = unsettled.get(0);
		for (int x = 0;x < unsettled.size();x++) 
		{
			if (!unsettled.get(x).isKnown()) 
			{
				for (int y = 0;y < unsettled.size();y++) 
				{
					if (unsettled.get(y).getCost()== -1 )
					{
						e= unsettled.get(y);

						
					}
				}
				
			}
			return e;

			
		}
		return e;

		
			
		}

		



	

	
	public String toString(){

		return "Source: " + starting_city + " Destination: " + ending_city + " Unsettled: "+ unsettled ;
	}





	List<Edge>route(String starting_city,String ending_city, List<String>attractions){


	while(unsettled!=null){
		Edge city = leastCostUnknownVertex();
		city.knownTrue();
		this.settled.add(city);
		this.unsettled.remove(city);

		for (Edge c : this.edges) 
		{	
			if (c.getCost()> city.getCost() +  this.edgeWeight(starting_city,ending_city,edges)) 
			{
				c.updateDistance(c,city,city.getCost());
				c.updatePath(city);

				
			}

			
			
		}

		
	}

	return settled;


	}

	int edgeWeight(String starting_city, String ending_city, List<Edge>edges){

		int min = 100;

		for(Edge e: edges){

			if (e.startingpoint==starting_city) 
			{

				min = e.getDistanceMile();
			}

		}
		return min;
	}










	





	


}