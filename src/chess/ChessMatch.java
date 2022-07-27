package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

//classe "cora��o" do jogo de xadrez, onde ter�o as regras do jogo
public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		// nessa classe que diz o tamanho do tabuleiro
		board = new Board (8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		// percorrer a matriz de pe�as do tabuleiro, e pra cada pe�a
		// do tabuleiro, feito um downcasting pra chesspiece
		
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				//downcasting abaixo
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	//instanciando as pe�as do xadrez informando as coordenadas do xadrez e n�o da matriz
	
	private void placeNewPiece(char columns, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(columns, row).toPosition());
	}
	
	
	
	//INITIAL SETUP, m�todo respons�vel por iniciar a partida de xadrez
	// colocando as pe�as no tabuleiro
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
	
}
