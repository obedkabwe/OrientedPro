package exercises3;

public class Student {

	public String name;
	public double primeiro;
	public double segundo;
	public double terceiro;
	
	
	
	
	
	
	public double finalGrade() {
		return this.primeiro + this.segundo + this.terceiro;
	}
	
	
	
	
	public double missing() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}else {
			return 0.0;
		}
		
	}
	
	
	
	
	
	
	
}
