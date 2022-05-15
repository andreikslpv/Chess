abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    abstract String getColor();

    abstract String getSymbol();
}
