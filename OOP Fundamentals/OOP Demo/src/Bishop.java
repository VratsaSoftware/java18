public class Bishop extends PlayingPiece {

    public Bishop(int coordinationX, int coordinationY) {
        super(coordinationX, coordinationY);
    }

    @Override
    boolean moveIsLegal(int newX, int newY) {
        return Math.abs(getCoordinationX() - newX) == Math.abs(getCoordinationY() - newY);
    }
}
