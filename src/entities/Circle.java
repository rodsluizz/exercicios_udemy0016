package entities;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
	}

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}
}
