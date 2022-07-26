package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	//somente criado o tabuleiro de construtor pois a posi��o rec�m criada
	// inicialmente � nula, pois ainda n�o foi colocada no tabuleiro
	public Piece(Board board) {		
		this.board = board;
		position = null;
	}


	// encapsulado sem o set, poir n�o � permitido o tabuleiro ser alterado
	// e protected pq s� � acessado no pacote tabuleiro e subclasse de pe�as
	protected Board getBoard() {
		return board;
	}


	
	
	

}
