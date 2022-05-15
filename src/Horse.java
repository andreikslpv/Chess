public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    private boolean checkHorseMove(int l, int c) {
        if ((l == 2 && c == 1) || (l == 1 && c == 2)) {
            return true;
        }
        return false;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && checkHorseMove(Math.abs(toLine - line), Math.abs(toColumn - column))
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
