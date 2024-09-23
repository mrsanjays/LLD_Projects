package Model;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Board {
	private int size;
	public PlayingPiece[][] board;
	public Board(int size) {
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}
	
	public int getSize() {
		return size;
	}
	public boolean addPiece(int row , int col , PlayingPiece type) {
		if(row < 0 || col < 0  || row >= size || col >= size || board[row][col] != null) {
			return false;
		}
		else {
			board[row][col] = type;
			return true;
		}
	}
	public List<int[]> findFreeCells(){
		List<int[]> freeCells = new ArrayList<>();
		for(int row = 0;row<size;row++) {
			for(int col = 0;col<size;col++) {
				if(board[row][col] == null) {
					int[] emptyCell = {row,col};
					freeCells.add(emptyCell);
				}
			}
		}
		return freeCells;
	}
	public void printBoard() {
	    System.out.println("+--------------------------------+");
	    System.out.println("|           Tic-Tac-Toe          |");
	    System.out.println("+--------------------------------+\n");

	    // Loop through the rows of the board
	    for (int row = 0; row < size; row++) {
	        System.out.print("\t");
	        for (int col = 0; col < size; col++) {
	            // Print the piece (X, O, or empty space)
	            if (board[row][col] != null) {
	                System.out.print(" " + board[row][col].pieceType + " ");
	            } else {
	                System.out.print("   "); // Empty cell
	            }

	            // Print the column separator '|' for all but the last column
	            if (col < size - 1) {
	                System.out.print("|");
	            }
	        }
	        System.out.println();

	        // Print a row separator between rows, but not after the last row
	        if (row < size - 1) {
	            System.out.print("\t");
	            for (int col = 0; col < size; col++) {
	                System.out.print("---");
	                if (col < size - 1) {
	                    System.out.print("+");
	                }
	            }
	            System.out.println();
	        }
	    }

	    System.out.println("\t+-------------------------+\n");
	}

   
}
