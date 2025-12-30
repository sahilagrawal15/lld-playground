package model;

import enums.PieceType;

public abstract class PlayingPiece {
    public PieceType pieceType;

    public PlayingPiece(){

    }
    public PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
    }
}
