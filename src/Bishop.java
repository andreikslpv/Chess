public class Bishop extends ChessPiece{

    public Bishop(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkBorder(line, toLine, column, toColumn) && chessBoard.board[toLine][toColumn] == null
                && Math.abs(toLine - line) == Math.abs(toColumn - column)) {
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
        return "B";
    }
}
