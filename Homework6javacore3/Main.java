package Homework6javacore3;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle () ;
		Rectangle rect2 = new Rectangle (2, 5) ;
		
		System.out.println(rect1);
		System.out.println(rect2);
		
		System.out.println(" Площа прямокутника №1 = " + rect1.rectArea(rect1.getLength(),rect1.getWidth()));
		System.out.println(" Периметр прямокутника №1 = " + rect1.rectPerimeter(rect1.getLength(),rect1.getWidth()));
		
		System.out.println(" Площа прямокутника №2 = " + rect2.rectArea(rect2.getLength(),rect2.getWidth()));
		System.out.println(" Периметр прямокутника №2 = " + rect2.rectPerimeter(rect2.getLength(),rect2.getWidth()));
		
		System.out.println();
		
		
		Circle circle1 = new Circle (4.5, 7);
		Circle circle2 = new Circle (3.3, 5.6);
		
				
		System.out.println(circle1);
		System.out.println(circle2);	
		
		System.out.println("Площа кола #1 = " + circle1.circleArea(circle1.getDiameter()));
		System.out.println("Довжина кола #1 = " + circle1.circleLenght(circle1.getRadius()));
		
		System.out.println("Площа кола #2 = " + circle2.circleArea(circle2.getDiameter()));
		System.out.println("Довжина кола #2 = " + circle2.circleLenght(circle2.getRadius()));
		
		System.out.println();
		
		circle1.circleAreaConsole(circle1.getDiameter());
		circle1.circleLenghtConsole(circle1.getRadius());
		
		circle2.circleAreaConsole(circle2.getDiameter());
		circle2.circleLenghtConsole(circle2.getRadius());
		
	}
}
