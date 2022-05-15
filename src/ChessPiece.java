abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public boolean checkPos(int pos) {
        if (pos <= 7 && pos >= 0) {
            return true;
        } else {
            return false;
        }
    }

    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    abstract String getColor();

    abstract String getSymbol();
}
