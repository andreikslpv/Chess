abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public boolean checkBorder(int line, int column, int toLine, int toColumn) {
        if (toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0 && !((line == toLine) && (column == toColumn))) {
            return true;
        } else {
            return false;
        }
    }

    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    abstract String getColor();

    abstract String getSymbol();
}
