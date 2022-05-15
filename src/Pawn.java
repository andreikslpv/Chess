public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    private boolean checkPawnMove(int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (column != toColumn) {
            return false;
        }
        int l = toLine - line;
        if (color.equals("White") && line == 1 && (l == 1 || l == 2)) {
            result = true;
        }
        if (color.equals("White") && line > 1 && l == 1) {
            result = true;
        }
        if (color.equals("Black") && line == 6 && (l == -1 || l == -2)) {
            result = true;
        }
        if (color.equals("Black") && line < 6 && l == -1) {
            result = true;
        }
        return result;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && checkPawnMove(line, column, toLine, toColumn)
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
        return "P";
    }
}
