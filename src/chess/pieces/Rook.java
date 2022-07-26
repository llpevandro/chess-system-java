package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);		
	}
	
	@Override
	public String toString() {
		return "R";
		//onde vai ter a peça no tabuleiro, vai ter somente a primeira letra Rook
	}
	

}
