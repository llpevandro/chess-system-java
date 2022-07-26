package chess;

import boardgame.Board;
import boardgame.Position;
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

	//INITIAL SETUP, m�todo respons�vel por iniciar a partida de xadrez
	// colocando as pe�as no tabuleiro
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
	}
	
}
