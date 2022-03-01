package lab5.q2;

public abstract class Shape {
	
	protected double dim1;
	protected double dim2;
	
	public static final double PI = 3.14;

	public Shape(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public void printShape() {
		System.out.println("Inside Area for " + this.getClass().getSimpleName() + ".");
	}

	public abstract double area();
}
