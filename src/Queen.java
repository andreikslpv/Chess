public class Queen extends ChessPiece{

    public Queen(String color) {
        super(color);
    }

    private boolean checkQueenMove(int l, int c) {
        if ((Math.abs(l) == Math.abs(c)) || (l == 0 || c == 0)) {
            return true;
        }
        return false;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && checkQueenMove(toLine - line, toColumn - column)
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
        return "Q";
    }
}

