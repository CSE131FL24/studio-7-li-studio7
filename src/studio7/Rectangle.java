package studio7;

public class Rectangle {
	private double width;
	private double length;
	public static double area;
	public static double perimeter;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		area = width * length;
		perimeter = 2 * width + 2 * length;
	}
		
	public String toString() {
		return "width: " + this.width + "  length: " + this.length + "  area: " + area + "  perimeter: " + perimeter;
	}
	public static boolean isSquare(Rectangle a) {
		return a.width==a.length;
	}
	public boolean biggerThan(Rectangle a, Rectangle b) {
		return a.area > b.area;
	}
	public static void main(String[] args) {
		Rectangle a = new Rectangle(3.0, 5.0);
		System.out.println(a);
		Rectangle b = new Rectangle(4.0, 4.0);
		System.out.println(b);
		
		if(a.area > b.area) {
			System.out.println("a is bigger");
		} else {
			System.out.println("b is bigger");
		}
		
		if(isSquare(a)) {
			System.out.println("a is a square");
		}
		if(isSquare(b)) {
			System.out.println("b is a square");
		}
	}

}
