package shape;

public class Square implements Shape{
	double a;
	
	public Square(double a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double calculateP() {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public double calculateO() {
		// TODO Auto-generated method stub
		return 4*a;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-5s%-7.2f%-5s%-7.2f%-5s%-7.2f\n","Square","a = ",a,"P = ",calculateP(),"O = ",calculateO());
		
	}
	
}
