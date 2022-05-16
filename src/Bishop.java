public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].getColor().equals(this.color))
                && chessBoard.board[line][column] != null) {
            if (!chessBoard.board[line][column].equals(this)) return false;
            if (Math.abs(toLine - line) == Math.abs(toColumn - column)) {
                return chessBoard.checkDiagonalForFree(line, column, toLine, toColumn);
            }
        } else {
            return false;
        }
        return false;
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
