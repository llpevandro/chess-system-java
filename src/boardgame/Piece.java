package boardgame;

public class Piece {
	
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


	
	
	

}
