
public  final class TennisGameConstants {
	public static final String[] POINTS_DESCRIPTION = new String[] {TennisGameConstants.LOVE,TennisGameConstants.FIFTEEN,TennisGameConstants.THIRTY,TennisGameConstants.FORTY};
	
	public static final String DEUCE = "deuce";
    public static final String ADVANTAGE = "advantage ";
    public static final String GAME_WON_BY = "game won by ";
    public static final Integer MAXIMUM_POINTS = 3;
    public static final String LOVE = "love";
    public static final String FIFTEEN = "fifteen";
    public static final String THIRTY = "thirty";
    public static final String FORTY = "forty";
    public static final String POINTS_OUT_OF_BOUND_MESSAGE= "A player can have only one of the following points 0,1,2 and 3 corresponding to love, fifteen, thirty and forty respectively";
    public static final String getPointsDescription(int points) 
	{
	   try	{
		   
	   
		return TennisGameConstants.POINTS_DESCRIPTION[points];
	   }
	   catch(Exception ex) {
		   return TennisGameConstants.POINTS_OUT_OF_BOUND_MESSAGE;
	   }
	}
    
    public static final String deuceMessage() {
		
		return TennisGameConstants.DEUCE;
	}

    public static final String advantageMessage(String name) {
		return TennisGameConstants.ADVANTAGE+name;
	}

    public static final String gameWonMessage(String name) {
		return TennisGameConstants.GAME_WON_BY+name;
	}
}
