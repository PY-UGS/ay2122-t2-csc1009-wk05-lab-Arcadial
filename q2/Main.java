package lab5.q2;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(9, 5);
		Triangle triangle = new Triangle(10, 8);
		Circle circle = new Circle(5, 5);
		Ellipse ellipse = new Ellipse(7, 7);
		Square square = new Square(6, 6);
		
		Shape figref;
		figref = rectangle;
		figref.printShape();
		System.out.println("Area is " + figref.area());
		
		figref = triangle;
		figref.printShape();
		System.out.println("Area is " + figref.area());

		figref = circle;
		figref.printShape();
		System.out.println("Area is " + figref.area());

		figref = ellipse;
		figref.printShape();
		System.out.println("Area is " + figref.area());

		figref = square;
		figref.printShape();
		System.out.println("Area is " + figref.area());
	}

}
