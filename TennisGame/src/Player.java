
public class Player {
	
	private int points;
	
	private String name;

	private Boolean won = false;
	
	private Boolean advantage = false;
	
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

	public Boolean hasWon() {
		return this.won;
		
	}
	
	public void setWon(Boolean won) {
		this.won = won;
	}

	public void setAdvantage(Boolean advantage) {
		this.advantage = advantage;
		
	}
	
	public Boolean isAtAdvantage() {
		return this.advantage;
	}
	
	

}
