package application;

public class GameObject {

    private int width, height;
    private int x, y;
    private char symbol;

    // Getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public char getSymbol() {
        return symbol;
    }

    // Setters
    public void setX(int newLocation) {
        if (newLocation >= 0 && newLocation < this.width) {
            this.x = newLocation;
        }
    }

    public void setY(int newLocation) {
        if (newLocation >= 0 && newLocation < this.height) {
            this.y = newLocation;
        }
    }

    public void setSymbol(char newSymbol, GameScreen screen) {
        this.symbol = newSymbol;
        this.width = screen.getScreenWidth();
        this.height = screen.getScreenHeight();
    }
}
