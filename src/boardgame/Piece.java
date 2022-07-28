package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	//somente criado o tabuleiro de construtor pois a posição recém criada
	// inicialmente é nula, pois ainda não foi colocada no tabuleiro
	public Piece(Board board) {		
		this.board = board;
		position = null;
	}


	// encapsulado sem o set, poir não é permitido o tabuleiro ser alterado
	// e protected pq só é acessado no pacote tabuleiro e subclasse de peças
	protected Board getBoard() {
		return board;
	}

	// método gancho / hook method. Método concreto que utiliza o metodo abstrado neste caso
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}				
		}
		return false;
	}
	

}
