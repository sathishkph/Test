
import java.util.Scanner;

/**
 * Main class
 */
public class Player_Rating {
    
	/**
     * Main method
     * @param args 
     */
    public static void main(String[] args) {
	       Player p = new CricketPlayer("Dev","Dutt",10);
	      
	       p.getRating();
    }
    
    public static class Player {
    	private String firstName;
    	private String lastName;
    	public Player(String firstName,String lastName  ){
    		this.firstName = firstName;
    		this.lastName = lastName;
    	}
    	public String getName(String firstName,String lastName ){
    		return firstName + " " + lastName;
    	}
    	public int getRating(){
    		return 0;
    	}
    	public int getRating1(){
    		return 0;
    	}
    }
    public static class CricketPlayer extends Player {
    	private double averageRuns;
    	
    	public CricketPlayer(String firstName,String lastName,double averageRuns) {
    	    super(firstName, lastName);
    		this.averageRuns = averageRuns;
    	}
    	public int getRating() {
    		if (averageRuns > 55) {return 7;}
    	else if (averageRuns > 50) {return 6;}
    	else if (averageRuns > 40) {return 5;}
    	else if (averageRuns > 30) {return 3;}
    	else if (averageRuns > 20) {return 2;}
    	else if (averageRuns <= 20) {return 1;}
    	else { return 0;}
    		    	}
    }
    
      public class FootballPlayer extends Player {
    	private int goals;
    	public FootballPlayer(String firstName,String lastName,int goals){
    		super(firstName, lastName);
    		this.goals = goals;
    	}
    	public int getRating(){
    		if (goals > 20) {return 5;}
    		else if (goals > 15) {return 4;}
    		else if (goals > 10) {return 3;}
    		else if (goals > 5) {return 2;}
    		else if (goals <= 5) { return 1;}
    		else { return 0;}
    		
    		    	}
    }

	
}


