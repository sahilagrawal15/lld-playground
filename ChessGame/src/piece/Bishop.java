package piece;
import board.Board;
import enums.Color;

public class Bishop extends Piece {
    public Bishop(Color color){
        super();
    }
    public boolean move(Board board, int currentRow, int currentCol, int targetRow, int targetCol, boolean isCapture){
        if (currentRow < 0 || currentRow > 7 || currentCol < 0 || currentCol > 7 ||
                targetRow < 0 || targetRow > 7 || targetCol < 0 || targetCol > 7) {
            return false;
        }

        // Diagonal movement check
        if (Math.abs(targetCol - currentCol) != Math.abs(targetRow - currentRow)) {
            return false;
        }

        // Determine direction of movement
        int rowStep = (targetRow > currentRow) ? 1 : -1;
        int colStep = (targetCol > currentCol) ? 1 : -1;

        // Validate path
        int row = currentRow + rowStep;
        int col = currentCol + colStep;
        while (row != targetRow && col != targetCol) {
            if (!board.isSquareEmpty(row, col)) { // Replace with actual board method
                return false;
            }
            row += rowStep;
            col += colStep;
        }

        // If capture, ensure target square contains an opponent's piece
        if (isCapture && !board.isOpponentPiece(row, col, getColor())) { // Replace with actual board method
            return false;
        }

        return true;
    }
    //move(0, 2, 5, 7, false);
}
