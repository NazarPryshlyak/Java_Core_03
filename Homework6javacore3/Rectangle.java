package Homework6javacore3;

public class Rectangle {

	private int length ;  //довжина
	private int width ;   // ширина
	
	Rectangle () {
		this.length = 20 ;
		this.width = 30 ;		
	}
	
	Rectangle ( int lenght, int width ) {
		this.length = lenght ;
		this.width = width ;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int rectArea ( int lenght, int width ) {
		int area = lenght * width ;
		return area ;
	}
	
	public int rectPerimeter (  int lenght, int width ) {
		int perimeter = ( lenght + width ) * 2 ;
		return perimeter ;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}
