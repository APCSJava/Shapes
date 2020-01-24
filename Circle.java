

public class Circle extends Ellipse {
	private double radius;

	public Circle(int id, double radius) {
		super(id, radius, radius);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
}