package chess;

import boardgame.Board;

//classe "coração" do jogo de xadrez, onde terão as regras do jogo
public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		// nessa classe que diz o tamanho do tabuleiro
		board = new Board (8,8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		// percorrer a matriz de peças do tabuleiro, e pra cada peça
		// do tabuleiro, feito um downcasting pra chesspiece
		
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				//downcasting abaixo
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

}
