public class Rook extends ChessPiece{

    public Rook(String color) {
        super(color);
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(toLine) && checkPos(column) && checkPos(toColumn)
                && !((line == toLine) && (column == toColumn))
                && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].getColor().equals(this.color))
                && chessBoard.board[line][column] != null) {
            if (!chessBoard.board[line][column].equals(this)) return false;
            if ((toLine - line) == 0 || (toColumn - column) == 0) {
                if (toLine > line) {
                    for (int i = 1; i < toLine - line; i++) {
                        if (chessBoard.board[line+i][column] != null) return false;
                    }
                }
                if (toLine < line) {
                    for (int i = 1; i < line - toLine; i++) {
                        if (chessBoard.board[line-i][column] != null) return false;
                    }
                }
                if (toColumn < column) {
                    for (int i = 1; i < column - toColumn; i++) {
                        if (chessBoard.board[line][column-i] != null) return false;
                    }
                }
                if (toColumn > column) {
                    for (int i = 1; i < toColumn - column; i++) {
                        if (chessBoard.board[line][column+i] != null) return false;
                    }
                }
                return true;
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
        return "R";
    }
}

