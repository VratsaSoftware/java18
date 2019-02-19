public abstract class PlayingPiece {
    private int coordinationX;
    private int coordinationY;
    private boolean isAlive;

    public PlayingPiece(int coordinationX, int coordinationY) {
        this.coordinationX = coordinationX;
        this.coordinationY = coordinationY;
        isAlive = true;
    }

    public void move(int newX, int newY) {
        if (isInsideBoard(newX, newY) && moveIsLegal(newX, newY)) {
            this.coordinationX = newX;
            this.coordinationY = newY;
        }
    }

    abstract boolean moveIsLegal(int newX, int newY);

    private boolean isInsideBoard(int newX, int newY) {
        return (newX >= 0 && newX < 8) && (newY >= 0 && newY < 8);
    }

    public int getCoordinationX() {
        return coordinationX;
    }

    public int getCoordinationY() {
        return coordinationY;
    }
}
