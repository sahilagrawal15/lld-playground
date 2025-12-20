package board;

import enums.Color;
import piece.Piece;

public class Board {
    private Piece[][] piece = new Piece[8][8];
    public boolean isSquareEmpty(int row, int col) {
        return piece[row][col] == null ;
    }

    public boolean isOpponentPiece(int row, int col, Color color) {
        return !isSquareEmpty(row, col) && piece[row][col].getColor() != color;
    }
    public void makeMove(int currRow, int currCol, int tarRow, int tarCol, Piece piece){
        if(piece.move()){
            piece[currRow][currCol] = null;
            piece[tarRow][tarCol] = piece;
        }
    }
}
