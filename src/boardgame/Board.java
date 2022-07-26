package boardgame;

public class Board {
	//quantidade de linhas e colunas e matriz de pe�as
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {		
		this.rows = rows;
		this.columns = columns;
		//feito manual o comando da coluna abaixo
		pieces = new Piece[rows][columns];
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//metodo responsavel por colocar a pe�a na posi��o
	
	public void placePiece(Piece piece, Position position) {
		//essa matriz abaixo foi criada e instanciada nesta classe do tabuleiro
		
		pieces[position.getRow()][position.getColumn()] = piece;
		//abaixo a pe�a n�o est� mais na posi��o nula e sim na posi��o que foi chamada acima
		//� possivel acessar a posi��o pois est� 'protected' na classe position no mesmo pacote
		piece.position = position;
	}

}
