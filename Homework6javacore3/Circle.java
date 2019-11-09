package Homework6javacore3;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public double circleArea (double diameter) {
		double area = ( Math.PI * diameter * diameter ) / 4 ;
		return area;
	}
	
	public double circleLenght (double radius) {
		double lenght = Math.PI * radius * 2 ;
		return lenght;
	}
	
	public void circleAreaConsole (double diameter) {
		double area = ( Math.PI * diameter * diameter ) / 4 ;
		System.out.println(" Площа круга = " + area);
		
	}	

	public void circleLenghtConsole (double radius) {
		double lenght = Math.PI * radius * 2 ;
		System.out.println(" Довжина круга = " + lenght);
		}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
	}
}
