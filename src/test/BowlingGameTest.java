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

}
