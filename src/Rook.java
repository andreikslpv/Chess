public class Rook extends ChessPiece{

    public Rook(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && ((toLine - line) == 0 || (toColumn - column) == 0)
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
        return "R";
    }
}

