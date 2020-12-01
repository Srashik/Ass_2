
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class RecommendedRoute {

		
		List<Edge> edges;
		Graph graph;
	

	public RecommendedRoute(){

		
		edges = new ArrayList<Edge>();



	}


	

	public static void main(String[] args) throws FileNotFoundException {

		//User input for starting point of route
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter starting point here!");
		String starting_city = s.nextLine();
		// s.close();
		

		RecommendedRoute r = new RecommendedRoute();


		//User input for destination of route
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter final destination here!");
		String ending_city = sc.nextLine();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("How many tourist sights would you like to visit along the way?");
		int att = sc1.nextInt();
		
		


		File myFile = new File("attractions.csv");
		File myFile1 = new File("roads.csv");
		Scanner scf = new Scanner(myFile);
		Scanner scf1 = new Scanner(myFile1);
	
		List<String> touristStops = new ArrayList<String>();
		List<String> attraction_locations = new ArrayList<String>();
		List<String> attraction_names = new ArrayList<String>();
		


	
		for(int x = 0; x < att;x++){

			Scanner scf2 = new Scanner(System.in);

			System.out.println("Please input the attractions you would like to visit.");
			String attraction_stops = scf2.nextLine();

			touristStops.add(attraction_stops);
				
			}





			while(scf.hasNext())
			{
				String attraction = scf.nextLine();
				String list [] = attraction.split(",");
				
				attraction_names.add(list[0]);
				attraction_locations.add(list[1]);
				
						
					
			}


			
			int x = 0;
			while(scf1.hasNext()){
			
				
				String road = scf1.nextLine();
				String [] list = road.split(",");
				r.edges.add(new Edge(list[0],list[1],Integer.parseInt(list[2]),Integer.parseInt(list[3]),attraction_locations));



				x++;
				
				
				
			}

			r.edges.add(new Edge(starting_city,ending_city,-1,-1,touristStops));
			r.graph = new Graph(touristStops,r.edges);
			r.graph.route(starting_city,ending_city,attraction_names);
			
			
			
			
	}
	


		
	
		





		
	}


