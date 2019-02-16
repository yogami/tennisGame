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
		
		assertEquals("love love", game.getScore());
	
	}
	
	@Test
	public void scoreIsFifteenLove() {
		
		game.firstPlayerScores();
		assertEquals("fifteen love", game.getScore());
	}
	
	@Test
	public void scoreIsLoveFifteen() {
		
		game.secondPlayerScores();
		assertEquals("love fifteen", game.getScore());
	}
	
	@Test
	public void scoreIsFifteenAll() {
		
		game.firstPlayerScores();
		game.secondPlayerScores();
		assertEquals("fifteen fifteen", game.getScore());
	}
	
	@Test
    public void scoreIsThirtyFifteen() {
		
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals("thirty fifteen", game.getScore());
	}
	@Test
    public void scoreIsFifteenThirty() {
		
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals("fifteen thirty", game.getScore());
	}
	
	@Test
    public void scoreIsThirtyAll() {
		
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		assertEquals("thirty thirty", game.getScore());
	}
	
	@Test
	public void firstPlayerWinsLoveGame() {
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		assertEquals("game won by "+firstPlayer.getName(), game.getScore());
	}
	
	@Test
	public void secondPlayerWinsLoveGame() {
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.secondPlayerScores();
		assertEquals("game won by "+secondPlayer.getName(), game.getScore());
	}
	
	@Test
	public void gameOutOfBoundMessage() {
		
	}
	
	@Test
    public void scoreIsDeuce() {
		
		game.secondPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		game.firstPlayerScores();
		game.secondPlayerScores();
		game.firstPlayerScores();
		assertEquals("deuce", game.getScore());
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
		assertEquals("advantage "+firstPlayer.getName(),game.getScore());
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
		assertEquals("advantage "+secondPlayer.getName(),game.getScore());
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
		assertEquals("game won by "+secondPlayer.getName(),game.getScore());
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
		assertEquals("deuce",game.getScore());
	}
	
	
	
	

}
