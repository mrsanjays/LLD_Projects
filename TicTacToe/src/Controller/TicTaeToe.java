package Controller;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;

import Model.Board;
import Model.PieceType;
import Model.Player;
import Model.PlayingPiece;
import Model.PlayingPieceO;
import Model.PlayingPieceX;

public class TicTaeToe {
	
	Board gameBoard;
	Deque<Player> players;
	public void initializeGame() {
		players = new LinkedList<>();
		PlayingPieceX crossPieceType = new PlayingPieceX();
		Player player1 = new Player("I",crossPieceType);
		PlayingPieceO donutPieceType = new PlayingPieceO();
		Player player2 = new Player("II",donutPieceType);
		
		players.add(player1);
		players.add(player2);
		
		
		startGame();
	}
	public void startGame() { 
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the Board Size : ");
		int size = inputScanner.nextInt();
		
		gameBoard = new Board(size);
		boolean noWinner = true;
		while(noWinner) {
			Player playerTurn = players.removeFirst();
			gameBoard.printBoard();
			
			List<int[]> freeCellsList = gameBoard.findFreeCells();
			if(freeCellsList.isEmpty()) {
				noWinner = false;
				continue;
			}
			
			System.out.print("Player:" + playerTurn.getName() + " Enter row,column: ");
            
            int row = inputScanner.nextInt();
            int col = inputScanner.nextInt();
            
            boolean placePieceStatus = gameBoard.addPiece(row, col, playerTurn.getPlayingPiece());
            if(!placePieceStatus) {
            	
            	System.out.println("Incorrect row and col , type correctly");
            	players.addFirst(playerTurn); // again same player , have to play
            	continue;
            }
            players.addLast(playerTurn); // for next move , add before
            
            boolean winner = checkWinner(row,col,gameBoard,playerTurn.getPlayingPiece().pieceType);
            if(winner) {
            	gameBoard.printBoard();
            	System.out.println("Player "+playerTurn.getName() +" Won !!");
            	return;
            }
            
		}
		gameBoard.printBoard();
		System.out.println("Match Tied !");
		
	}
	private boolean checkWinner(int row, int col, Board gameBoard, PieceType type) {
	    // Check the row
	    boolean rowWin = true;
	    for (int i = 0; i < gameBoard.getSize(); i++) {
	        if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != type) {
	            rowWin = false;
	            break;
	        }
	    }

	    // Check the column
	    boolean colWin = true;
	    for (int i = 0; i < gameBoard.getSize(); i++) {
	        if (gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != type) {
	            colWin = false;
	            break;
	        }
	    }

	    // Check the main diagonal
	    boolean mainDiagonalWin = true;
	  
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.board[i][i] == null || gameBoard.board[i][i].pieceType != type) {
                mainDiagonalWin = false;
                break;
            }
        }
	    

	    // Check the anti-diagonal
	    boolean antiDiagonalWin = true;
	    
        for (int i = 0; i < gameBoard.getSize(); i++) {
            if (gameBoard.board[i][gameBoard.getSize() - 1 - i] == null || gameBoard.board[i][gameBoard.getSize() - 1 - i].pieceType != type) {
                antiDiagonalWin = false;
                break;
            }
        }
	    

	    // Return true if any of the checks indicate a win
	    return rowWin || colWin || mainDiagonalWin || antiDiagonalWin;
	}

}
