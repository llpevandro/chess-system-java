package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		
		//abaixo o construtor da classe Piece
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	// sem set para não alterar a cor, somente acessada (set)
	
}
