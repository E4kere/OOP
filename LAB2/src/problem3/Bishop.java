package problem3;

class Bishop extends Piece {
	
	public Bishop(int row, int column){
		super(row, column); }
	
	@Override
    public boolean isLegalMove(Piece from, int rows, int columns) {
		int move1 = Math.abs(row - rows);
        int move2 = Math.abs(column - columns);
        return move1 <= 1 && move2 <= 1;
}

}
