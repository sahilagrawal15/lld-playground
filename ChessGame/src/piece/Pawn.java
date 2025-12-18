package piece;
import enums.Color;
public class Pawn extends Piece {

    public Pawn(Color color){
        super(color);
    }

    public boolean move(int currentRow, int currentCol, int targetRow, int targetCol, boolean isCapture) {

        if (currentRow < 0 || currentRow > 7 || currentCol < 0 || currentCol > 7 ||
                targetRow < 0 || targetRow > 7 || targetCol < 0 || targetCol > 7) {
            return false;
        }

        int dir = (getColor() == Color.WHITE) ? 1: -1;

        //forward
        if(!isCapture && currentCol == targetCol){
            if(targetRow - currentRow == dir){
                return true; //one move
            }
            if(targetRow - currentRow == 2 * dir && (currentRow == 1 || currentRow == 6)){
                return true;
            }
        }
        //kill
        if (isCapture && (targetRow - currentRow == dir) && Math.abs(targetCol - currentCol) == 1){
            return true;
        }
        return false;


    }
    // move(1, 2, 0, 1, true); //two steps

        /*
        *  [  ,   ,   ,   ,   ,  ]
        *  [  ,   ,   ,   ,   ,  ]
        *  [  ]
        *  [  ,   ,   ,   ,   ,  ]
        * */



}
