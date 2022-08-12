package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	
	public ChessPosition(char column, int row) {
		//prog defensiva no teste abaixo
		if (column < 'a' || column > 'h' || row <1 || row >8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}		
		this.column = column;
		this.row = row;
	}
	
	// apagando set pra n�o permitir que linha e coluna sejam livremente alteradas
	
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	// metodo abaixo para converter as posi��es das coordenadas do tabuleiro, para a matriz do tabuleiro
	// ex: posi��o a8 = posi��o 0,0 da matriz
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	//abaixo m�todo inverso do m�todo acima: data uma posi��o na matriz, converter para uma posi��o do tabuleiro
	
	protected static ChessPosition fromPosition(Position position) {
		//casting pra char pq a convers�o n�o � autom�tica
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	// imprimindo a posi��o de xadrez na ordem. "" vazio para for�ar a concatena��o de strings.
	@Override	
	public String toString () {
		return "" + column + row;
	}
	
}
