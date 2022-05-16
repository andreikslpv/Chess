public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && chessBoard.board[line][column] != null) {
            if (!chessBoard.board[line][column].equals(this)) return false;
            int l = toLine - line;
            if (column == toColumn && chessBoard.board[toLine][toColumn] == null) {
                if (color.equals("White") && line == 1 && (l == 1 || l == 2)) return true;
                if (color.equals("White") && line > 1 && l == 1) return true;
                if (color.equals("Black") && line == 6 && (l == -1 || l == -2)) return true;
                if (color.equals("Black") && line < 6 && l == -1) return true;
            } else if (Math.abs(toColumn - column) == 1 && chessBoard.board[toLine][toColumn] != null
                    && !chessBoard.board[toLine][toColumn].getColor().equals(this.color)) {
                if (color.equals("White") && l == 1) return true;
                if (color.equals("Black") && l == -1) return true;
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
        return "P";
    }
}
