

public class Tester {

	public static void main(String[] args) {
		
		Shape s1 = new Ellipse(1, 2.0, 4.0);
		Shape s2 = new Circle(2, 4.0);
		Shape s3 = new Rectangle(3, 4, 5);
		Shape s4 = new Square(4, 3);
		Shape[] shapes = {s1, s2, s3, s4};
		for (int i = 0; i< shapes.length; i++) {
			System.out.println(shapes[i].getArea());
		}
	}
}
