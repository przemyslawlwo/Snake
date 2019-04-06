package application;

public class Snake extends GameObject {

    private char foodSymbol;

	public Snake(char symbol, int xStartingLocation, int yStartingLocation, GameScreen screen, char foodSymbol) {
		setSymbol(symbol, screen);
		setX(xStartingLocation);
		setY(yStartingLocation);
        this.foodSymbol = foodSymbol;
	}
	
	public boolean moveLeft(GameScreen screen) {
        this.setX(getX() - 1);
        boolean foodEaten = this.checkIfFoodEaten(screen);
        screen.setObjectOnLocation(this, this.getX(), this.getY());
		screen.ClearScreenLocation(this.getX() + 1, this.getY());
        return foodEaten;
    }
	
	public boolean moveRight(GameScreen screen) {
        this.setX(getX() + 1);
        boolean foodEaten = this.checkIfFoodEaten(screen);
		screen.setObjectOnLocation(this, this.getX(), this.getY());
		screen.ClearScreenLocation(this.getX() - 1, this.getY());
        return foodEaten;
    }
	
	public boolean moveUp(GameScreen screen) {
        this.setY(getY() - 1);
        boolean foodEaten = this.checkIfFoodEaten(screen);
        screen.setObjectOnLocation(this, this.getX(), this.getY());
		screen.ClearScreenLocation(this.getX(), this.getY() + 1);
        return foodEaten;
    }
	
	public boolean moveDown(GameScreen screen) {
        this.setY(getY() + 1);
        boolean foodEaten = this.checkIfFoodEaten(screen);
        screen.setObjectOnLocation(this, this.getX(), this.getY());
		screen.ClearScreenLocation(this.getX(), this.getY() - 1);
		return foodEaten;
	}

	private boolean checkIfFoodEaten(GameScreen screen) {
        char obj = screen.getObjectOnLocation(this.getX(), this.getY());
        return obj == this.foodSymbol;
    }
}