
public class Player {
	
	private int points;
	
	private String name;
	
	public Player(String name){
		this.name = name;
	}

	public int getPoints() {
		
		return points;
	}

	public void incrementPoints() {
		points++;
		
	}

	

	public String getName() {
		
		return name;
	}
	
	

}
