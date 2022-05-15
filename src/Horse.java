public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkBorder(line, toLine, column, toColumn)
                && (Math.abs(toLine - line)+Math.abs(toColumn - column) == 3)
                && chessBoard.board[toLine][toColumn] == null) {
            result = true;
        }
        return result;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    String getSymbol() {
        return "H";
    }
}
