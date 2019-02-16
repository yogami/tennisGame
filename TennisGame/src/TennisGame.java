
public class TennisGame {
	
	
    
    
	Player firstPlayer,secondPlayer;
	
	public TennisGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getScore() {
	
		
		if(bothPlayersHaveMoreThanOrEqualToMaxPoints()) {
			if(firstPlayer.getPoints() > secondPlayer.getPoints()) {
				if((firstPlayer.getPoints() - secondPlayer.getPoints()) > 1) {
					return TennisGameConstants.gameWonMessage(firstPlayer.getName());
				}
				else
				  return TennisGameConstants.advantageMessage(firstPlayer.getName());
			}
			else if(secondPlayer.getPoints() > firstPlayer.getPoints()) {
				if((secondPlayer.getPoints() - firstPlayer.getPoints()) > 1) {
					return TennisGameConstants.gameWonMessage(secondPlayer.getName());
				}
				else
    			   return TennisGameConstants.advantageMessage(secondPlayer.getName());
			}
			else
			   return TennisGameConstants.deuceMessage();
		}
		else if(firstPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) {
			return TennisGameConstants.gameWonMessage(firstPlayer.getName());
		}
        else if(secondPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) {
			return TennisGameConstants.gameWonMessage(secondPlayer.getName());
		}
		else
			return TennisGameConstants.getPointsDescription(firstPlayer.getPoints()) + " " + TennisGameConstants.getPointsDescription(secondPlayer.getPoints());
		
	}

	private boolean bothPlayersHaveMoreThanOrEqualToMaxPoints() {
		return (firstPlayer.getPoints()  >= TennisGameConstants.MAXIMUM_POINTS) && (secondPlayer.getPoints() >= TennisGameConstants.MAXIMUM_POINTS);
	}

	

	public void firstPlayerScores() {
		
		firstPlayer.incrementPoints();
	}

	public void secondPlayerScores() {
		secondPlayer.incrementPoints();
		
	}

}
