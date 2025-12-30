import enums.PieceType;
import model.PieceO;
import model.PieceX;
import model.Player;
import model.PlayingPiece;
import service.Board;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Deque<Player> player;
    private Board board;

    public void initializeGame(){
        player = new LinkedList<>();
        PieceO pieceO = new PieceO();
        PieceX pieceX = new PieceX();
        //Creating players for Game
        Player player1 = new Player("Sahil", pieceO);
        Player player2 = new Player("Pari", pieceX);

        player.add(player1);
        player.add(player2);

        board = new Board(3);
    }
    public void startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player turn = player.removeFirst();
            board.displayBoard();

        }
    }
}
