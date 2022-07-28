package boardgame;

public class Board {
	//quantidade de linhas e colunas e matriz de pe�as
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {	
		// abaixo, m�todo defensivo no teste
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at leats 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		//feito manual o comando da coluna abaixo
		pieces = new Piece[rows][columns];
	}

	// parte da defensiva, retirada o set row e set columns para que n�o sejam alterados.
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
	//abaixo, parte da defensiva no teste
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//metodo responsavel por colocar a pe�a na posi��o
	
	public void placePiece(Piece piece, Position position) {
		// parte da defensiva no teste abaixo
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		
		//essa matriz abaixo foi criada e instanciada nesta classe do tabuleiro
		
		pieces[position.getRow()][position.getColumn()] = piece;
		//abaixo a pe�a n�o est� mais na posi��o nula e sim na posi��o que foi chamada acima
		//� possivel acessar a posi��o pois est� 'protected' na classe position no mesmo pacote
		piece.position = position;
	}
	
	//metodo para remover pe�as
	public Piece removePiece(Position position) {
		//defensiva no teste abaixo
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		// se nao h� nenhuma pe�a na posi��o
		if (piece(position) == null)  {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	//criando dois m�todos de posi��o existentes
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece (Position position) {
		// teste defensivo, testa se existe a posip��o antes de testar se tem uma pe�a na posi��o
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	

}
