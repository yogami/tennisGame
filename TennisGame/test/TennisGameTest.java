import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TennisGameTest {
	
	public Player firstPlayer,secondPlayer;
	public TennisGame game;
	
	@BeforeEach
	public void setUp() {
		
		firstPlayer = new Player("andrei agassi");
		secondPlayer = new Player("pete sampras");
		game = new TennisGame(firstPlayer, secondPlayer);
		
	}

	@Test
	public void scoreIsLoveAll() {
		
		assertEquals(TennisGameConstants.LOVE + " " +TennisGameConstants.LOVE, game.getScore());
	
	}
	
	@Test
	public void scoreIsFifteenLove() {
		
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.FIFTEEN + " " +TennisGameConstants.LOVE, game.getScore());
	}
	
	@Test
	public void scoreIsLoveFifteen() {
		
		game.secondPlayerScores();
		assertEquals(TennisGameConstants.LOVE + " " +TennisGameConstants.FIFTEEN, game.getScore());
	}
	
	@Test
	public void scoreIsFifteenAll() {
		
		game.firstPlayerScores();
		game.secondPlayerScores();
		assertEquals(TennisGameConstants.FIFTEEN + " " +TennisGameConstants.FIFTEEN, game.getScore());
	}
	
	@Test
    public void scoreIsThirtyFifteen() {
		
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.THIRTY + " " +TennisGameConstants.FIFTEEN, game.getScore());
	}
	@Test
    public void scoreIsFifteenThirty() {
		
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.FIFTEEN + " " +TennisGameConstants.THIRTY, game.getScore());
	}
	
	@Test
    public void scoreIsThirtyAll() {
		
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.THIRTY + " " +TennisGameConstants.THIRTY, game.getScore());
	}
	
	@Test
	public void firstPlayerWinsLoveGame() {
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.GAME_WON_BY+firstPlayer.getName(), game.getScore());
	}
	
	@Test
	public void secondPlayerWinsLoveGame() {
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.secondPlayerScores();
		assertEquals(TennisGameConstants.GAME_WON_BY+secondPlayer.getName(), game.getScore());
	}
	
	
	
	@Test
    public void scoreIsDeuce() {
		
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.DEUCE, game.getScore());
	}
	
	@Test
	public void whenScoreIsDeuceThenFirstPlayerHasAdvantageIfHeScores() {
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.ADVANTAGE+firstPlayer.getName(),game.getScore());
	}
	
	@Test
	public void whenScoreIsDeuceThenSecondPlayerHasAdvantageIfHeScores() {
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		
		game.secondPlayerScores();
		assertEquals(TennisGameConstants.ADVANTAGE +secondPlayer.getName(),game.getScore());
	}
	
	@Test
	public void whenPlayerWithAdvantageScoresHeWinsTheGame() {
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.secondPlayerScores();
		assertEquals(TennisGameConstants.GAME_WON_BY+secondPlayer.getName(),game.getScore());
	}
	
	@Test
	public void whenPlayerWithoutAdvantageScoresItsBackToDeuce() {
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.DEUCE,game.getScore());
	}
	
	@Test
	public void whenOnePlayerExceedsWinningPoints(){
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		assertEquals(TennisGameConstants.GAME_WON_BY+firstPlayer.getName(), game.getScore());
	}
	
	
	
	

}
