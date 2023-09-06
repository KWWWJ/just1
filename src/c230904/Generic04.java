package c230904;


//class Parents<T>{
//	
//}
//
//class Child01<T> extends Parents<T>{
//	T t;
//	public T getT() {
//		return t;
//	}
//	public void SetT(T t) {
//		this.t = t;
//	}
//}
//class Child02<T1, T2> extends Parents<T1>{
//	
//}
class Shape<T>{
	protected T name;
	public Shape(T name) {
		this.name = name;
	}
	public double getArea() {
		return 0.0;
	}
	public void printInfo() {
		System.out.println("도형 :"+name);
		System.out.println("Area :"+getArea());
	}
	
}

class Circle<T> extends Shape<T>{
	private double radius;
	
	public Circle(T name, double radius) {
		super (name);
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
}

class Rectangle<T> extends Shape<T>{
	private double width;
	private double height;
	
	public Rectangle(T name, double height, double width) {
		super(name);
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
		return width*height;
	}
}

public class Generic04 {
	
	public static void main(String[] args) {
		
		Circle<String>circle = new Circle<>("원", 5.0);
		Rectangle<String>rectangle = new Rectangle<>("사각형", 4.0, 6.0);
		
		circle.printInfo();
		System.out.println();
		rectangle.printInfo();
		
	}
}
