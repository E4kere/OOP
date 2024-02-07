package problem3;

public abstract class Piece {
	int row;
	int column;
	
	public Piece (int row, int column) {
		this.column = column;
		this.row = row;
	}
	 public abstract boolean isLegalMove(Piece from, int row, int col);
}
