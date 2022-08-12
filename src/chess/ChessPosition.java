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
	
	// apagando set pra não permitir que linha e coluna sejam livremente alteradas
	
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	// metodo abaixo para converter as posições das coordenadas do tabuleiro, para a matriz do tabuleiro
	// ex: posição a8 = posição 0,0 da matriz
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	//abaixo método inverso do método acima: data uma posição na matriz, converter para uma posição do tabuleiro
	
	protected static ChessPosition fromPosition(Position position) {
		//casting pra char pq a conversão não é automática
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}
	
	// imprimindo a posição de xadrez na ordem. "" vazio para forçar a concatenação de strings.
	@Override	
	public String toString () {
		return "" + column + row;
	}
	
}
