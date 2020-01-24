

public class Ellipse extends Shape {
	private double semiMajorAxis;
	private double semiMinorAxis;

	public Ellipse(int id, double semiMajorAxis, double semiMinorAxis) {
		super(id);
		this.semiMajorAxis = semiMajorAxis;
		this.semiMinorAxis = semiMinorAxis;
	}

	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	public double semiMinorAxis() {
		return semiMinorAxis;
	}

	public double getArea() {
		return Math.PI * semiMinorAxis * semiMajorAxis;
	}
}