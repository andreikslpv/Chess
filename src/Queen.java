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
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].getColor().equals(this.color))
                && chessBoard.board[line][column] != null) {
            if (!chessBoard.board[line][column].equals(this)) return false;
            if (checkQueenMove(toLine - line, toColumn - column)) return true;
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
        return "Q";
    }
}

