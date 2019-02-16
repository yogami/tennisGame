
public class TennisGame {
	
	
    
    
	Player firstPlayer,secondPlayer;
	
	public TennisGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getScore() {
	
		
		if((firstPlayer.getPoints()  >= TennisGameConstants.MAXIMUM_POINTS) && (secondPlayer.getPoints() >= TennisGameConstants.MAXIMUM_POINTS)) {
			if(firstPlayer.getPoints() > secondPlayer.getPoints()) {
				if((firstPlayer.getPoints() - secondPlayer.getPoints()) > 1) {
					return gameWonMessage(firstPlayer.getName());
				}
				else
				  return advantageMessage(firstPlayer.getName());
			}
			else if(secondPlayer.getPoints() > firstPlayer.getPoints()) {
				if((secondPlayer.getPoints() - firstPlayer.getPoints()) > 1) {
					return this.gameWonMessage(secondPlayer.getName());
				}
				else
    			   return this.advantageMessage(secondPlayer.getName());
			}
			else
			   return this.deuceMessage();
		}
		else if(firstPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) {
			return this.gameWonMessage(firstPlayer.getName());
		}
        else if(secondPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) {
			return this.gameWonMessage(secondPlayer.getName());
		}
		else
			return firstPlayer.getPointsDescription() + " " + secondPlayer.getPointsDescription();
		
	}

	private String deuceMessage() {
		
		return TennisGameConstants.DEUCE;
	}

	private String advantageMessage(String name) {
		return TennisGameConstants.ADVANTAGE+name;
	}

	private String gameWonMessage(String name) {
		return TennisGameConstants.GAME_WON_BY+name;
	}

	public void firstPlayerScores() {
		
		firstPlayer.incrementPoints();
	}

	public void secondPlayerScores() {
		secondPlayer.incrementPoints();
		
	}

}
