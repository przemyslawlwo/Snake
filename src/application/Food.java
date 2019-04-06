package application;

public class Food extends GameObject {

	public Food(char symbol, GameScreen screen) {
		setSymbol(symbol, screen);
	}

	// Add food to random location inside the matrix limits
	public void addRandomFood(GameScreen screen) {
		screen.setObjectOnLocation(this, (int) (Math.random() * (screen.getScreenWidth() - 1)),
				(int) (Math.random() * (screen.getScreenHeight() - 1)));
	}
}
