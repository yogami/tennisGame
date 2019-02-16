
public class TennisGame {
	
	
    
    
	Player firstPlayer,secondPlayer;
	
	public TennisGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getScore() {
		
		if(doesGameHaveAWinner()) {
			return TennisGameConstants.gameWonMessage(findWinnersName());
		}
		
		if(doesGameHaveSomeoneWithAdvantage()) {
			return TennisGameConstants.advantageMessage(findPlayersNameWithAdvantage());
		}
		
		if(isGameDeuce()) {
			return TennisGameConstants.deuceMessage();
		}
	
		
		
		return TennisGameConstants.getPointsDescription(firstPlayer.getPoints()) + " " + TennisGameConstants.getPointsDescription(secondPlayer.getPoints());
		
	}

	private boolean isGameDeuce() {
		return ((firstPlayer.getPoints() == secondPlayer.getPoints()) && (firstPlayer.getPoints() >= TennisGameConstants.MAXIMUM_POINTS));
	}

	private String findPlayersNameWithAdvantage() {
		return firstPlayer.isAtAdvantage()?firstPlayer.getName():secondPlayer.getName();
	}

	private boolean doesGameHaveSomeoneWithAdvantage() {
		
        if ((firstPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) && (firstPlayer.getPoints() - secondPlayer.getPoints() == 1)){
			
			firstPlayer.setAdvantage(true);
			return true;
		}
		else if ((secondPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) && (secondPlayer.getPoints() - firstPlayer.getPoints() == 1)){
            secondPlayer.setAdvantage(true);
			return true;
		}
        else
        	return false;
	}

	private String findWinnersName() {
		return firstPlayer.hasWon()?firstPlayer.getName():secondPlayer.getName();
	}

	private boolean doesGameHaveAWinner() {
		if ((firstPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) && (firstPlayer.getPoints() - secondPlayer.getPoints() > 1)){
			
			firstPlayer.setWon(true);
			return true;
		}
		else if ((secondPlayer.getPoints() > TennisGameConstants.MAXIMUM_POINTS) && (secondPlayer.getPoints() - firstPlayer.getPoints() > 1)){
            secondPlayer.setWon(true);
			return true;
		}
        else
        	return false;
	}

	
	public void firstPlayerScores() {
		
		firstPlayer.incrementPoints();
	}

	public void secondPlayerScores() {
		secondPlayer.incrementPoints();
		
	}

}
