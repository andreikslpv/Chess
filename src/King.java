public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean result = false;
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1
                && chessBoard.board[toLine][toColumn] == null) {
            result = true;
        }
        return result;
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (board.board[i][j] != null && !board.board[i][j].getColor().equals(this.color)) {
                    if (board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    String getColor() {
        return color;
    }

    @Override
    String getSymbol() {
        return "K";
    }
}

