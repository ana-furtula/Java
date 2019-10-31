package shape;

public class Circle implements Shape {
	private double r;
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double calculateP() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}

	@Override
	public double calculateO() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-5s%-7.2f%-5s%-7.2f%-5s%-7.2f\n","Circle","r = ",r,"P = ",calculateP(),"O = ",calculateO());
		
	}
	
}
