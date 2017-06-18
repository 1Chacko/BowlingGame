package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Game;

public class BowlingGameTest {

	private void rollMany(int n, int pins, Game g) {
		for (int i = 0; i < n; i++) {
			g.roll(pins);
		}
	}

	@Test
	public void testGutterGame() {
		Game g = new Game();
		rollMany(20, 0, g);
		assertEquals(0, g.score());
	}

	@Test
	public void testAllOnes() {
		Game g = new Game();
		rollMany(20, 1, g);
		assertEquals(20, g.score());
	}

	@Test
	public void testOneSpare() {
		Game g = new Game();
		rollSpare(g);
		g.roll(3);
		rollMany(17, 0, g);
		assertEquals(16, g.score());
	}
	
	@Test
	public void testOneStrike() {
		Game g = new Game();
		rollStrike(g);
	    g.roll(3);
	    g.roll(4);
	    rollMany(16, 0, g);
	    assertEquals(24, g.score());
	}
	
	private void rollStrike(Game g) {
	    g.roll(10); 
	  }

	
	private void rollSpare(Game g) {
	    g.roll(5);
	    g.roll(5);
	  }

}
