public class Bishop extends ChessPiece{

    public Bishop(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && Math.abs(toLine - line) == Math.abs(toColumn - column)
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
        return "B";
    }
}
