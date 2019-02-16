
public class Player {
	
	private int points;
	private String[] pointsDescription = new String[] {TennisGameConstants.LOVE,TennisGameConstants.FIFTEEN,TennisGameConstants.THIRTY,TennisGameConstants.FORTY};
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

	public String getPointsDescription() 
	{
	   try	{
		   
	   
		return pointsDescription[points];
	   }
	   catch(Exception ex) {
		   return TennisGameConstants.POINTS_OUT_OF_BOUND_MESSAGE;
	   }
	}

	public String getName() {
		
		return name;
	}
	
	

}
