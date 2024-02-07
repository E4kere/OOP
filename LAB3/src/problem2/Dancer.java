package problem2;

public class Dancer implements Danceable{

	boolean move = true; 
	String jump;
	boolean circle = true ;
	
	public Dancer ( String move ,String jump, String circle) {
		this.jump = jump;
		}

	@Override
	public boolean MoveCircle() {
		if (circle) {
			return true;
			}
		else {
			return false;
		}
	}

	@Override
	public boolean MoveRight() {
		if (move) {
			return true;
			}
		else {
			return false;
		}
	}

	@Override
	public boolean MoveLeft() {
		if (move) {
			return true;
			}
		else {
			return false;
		}
	}

	@Override
	public String Dancesheshetka() {
		return"EEEEE! taatatat" + jump ;
		
	}

	@Override
	public String DanceQaraJorga() {
		return "Qara Jorga bolmasa, Bidin sani keremet!" + jump;
	}
	
	
	
}
