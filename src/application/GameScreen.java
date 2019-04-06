package application;

public class GameScreen {

    private int width, height;
    private int score = 0;
    private char[][] screenMatrix;

    public GameScreen(int width, int height) {
        this.width = width;
        this.height = height;
        this.screenMatrix = new char[this.height][this.width];
    }

    // Fill array with dots
    public void InitScreen() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                this.screenMatrix[i][j] = '.';
            }
        }
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Print the screen to console
    public void PrintScreen() {
        clearScreen();
        System.out.print("Points: " + score);
        System.out.println();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(this.screenMatrix[i][j]);
            }
            System.out.println();
        }
    }

    //Screen clear location
    public void ClearScreenLocation(int x, int y) {
        if (y == 0 || x == 0 || x == this.width - 1 || y == this.height - 1) {
            this.screenMatrix[y][x] = '#';
        } else {
            this.screenMatrix[y][x] = '.';
        }
    }

    // Getters
    public int getScreenWidth() {
        return this.width;
    }

    public int getScreenHeight() {
        return this.height;
    }

    public char getObjectOnLocation(int x, int y) {
        return this.screenMatrix[y][x];
    }

    // Setters
    public void setObjectOnLocation(GameObject object, int x, int y) {
        this.screenMatrix[y][x] = object.getSymbol();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
