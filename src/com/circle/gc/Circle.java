package com.circle.gc;

public class Circle {
	double classRadius;

	public Circle(double radius) {
		classRadius = radius;
	}
	
	public double getCircumference() {
		double circumference = classRadius * 2 * Math.PI;
		return circumference;
	}

	public double getArea() {
		double circumference = (Math.pow(classRadius, 2) * Math.PI);
		return circumference;
	}

	public String getFormattedCircumference() {
		String formatCirc = formatNumber(getCircumference());
		return formatCirc;
	}

	public String getFormattedArea() {
		String formatCirc = formatNumber(getArea());
		return formatCirc;
	}

	private String formatNumber(double x) {
		String number = String.format("%1$.2f", x);

		return number;
	}

}
