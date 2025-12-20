package piece;
import enums.Color;

public class Piece {
    private Color color;

    public Piece(){

    }
    public Piece(Color color) {
        this.color = color;
    }
    public Color getColor(){
        return this.color;
    }

    public boolean move() {
        return false;
    }


}
