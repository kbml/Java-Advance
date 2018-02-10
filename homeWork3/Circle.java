package homeWork3;

import java.text.NumberFormat;

public class Circle {

	private double radius;

	private static int objectCount;

	public Circle(double radius) {
		this.radius = radius;
		objectCount++;
	}

	// circumference

	public double getCircumference() {
		double circumference = Math.PI * 2 * radius;

		return circumference;

	}

	public String getFormattedCircumference() {
		String fc = this.formatNumber(this.getCircumference());
		return fc;
	}

	private String formatNumber(double circumference) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;

	}
	public String getFormattedArea() {
		String fa = this.formatNumber(this.getArea());
		return fa;
	}
	
}
