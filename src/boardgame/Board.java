package boardgame;

public class Board {
	//quantidade de linhas e colunas e matriz de peças
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
	
	
	

}
