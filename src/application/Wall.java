package application;

public class Wall extends GameObject {

	public Wall(GameScreen screen) {
		setSymbol('#', screen);
	}

	public Wall(char symbol, GameScreen screen) {
		setSymbol(symbol, screen);
	}

	// Add horizontal line of walls
	public void addWallsRow(GameScreen screen, Wall wall, int rowNumber) {
		for (int i = 0; i < screen.getScreenWidth(); i++) {
			screen.setObjectOnLocation(wall, i, rowNumber);
		}
	}

	// Add vertical line of walls
	public void addWallsColumn(GameScreen screen, Wall wall, int columnNumber) {
		for (int i = 0; i < screen.getScreenHeight(); i++) {
			screen.setObjectOnLocation(wall, columnNumber, i);
		}
	}
}
