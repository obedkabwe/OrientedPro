package exercises2;

public class Employee {

	
	public String name;
	public double grossSalary;
	public double tax;
	
	
	double netSalary() {
		double net = (this.grossSalary - this.tax);
		return net;
	}
	
	void increaseSalary(double percentage) {
		
		grossSalary += grossSalary * percentage / 100;
	}

	@Override
	public String toString() {
		return name + "," +  ""+ "$"+ netSalary() ;
	}
	
	
	
	
	
	
	
}
