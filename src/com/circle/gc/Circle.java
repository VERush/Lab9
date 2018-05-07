package com.circle.gc;

public class Circle {
	// Added private to variable declaration
	private double classRadius;
	private double circumference, area;
	private String number, formatCirc, formatArea;

	public Circle(double radius) {
		classRadius = radius;
	}
	
	public double getCircumference() {
		circumference = classRadius * 2 * Math.PI;
		return circumference;
	}

	public double getArea() {
		area = (Math.pow(classRadius, 2) * Math.PI);
		return area;
	}

	public String getFormattedCircumference() {
		formatCirc = formatNumber(getCircumference());
		return formatCirc;
	}

	public String getFormattedArea() {
		formatArea = formatNumber(getArea());
		return formatArea;
	}

	private String formatNumber(double x) {
		number = String.format("%1$.2f", x);
		return number;
	}

}
