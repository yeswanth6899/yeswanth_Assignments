<<<<<<< HEAD
package default_package;

public class Shapes {
	
	String color;
	
	Shapes(String color){
		this.color = color;
	}
	
	double area() {
		return 0;
	}
	
	double perimeter() {
		return 0;
	}
	
	void displayInfo() {
		System.out.println("Shape: " + this.getClass().getSimpleName());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
	
	public static void main(String[] args) {
		
		Shapes[] shape = new Shapes[4];
		
		shape[0] = new Circle("Red" , 5);
		shape[1] = new Rectangle("Blue", 6 , 8);
		shape[2] = new Triangle("Green", 2, 4, 6, 8, 10);
		shape[3] = new Square("Orange", 8);
		
		for(Shapes s: shape) {
			s.displayInfo();
		}
		
	}

}

class Circle extends Shapes{
	double radius;
	
	Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	double area() {
		return Math.PI *radius*radius;
	}
	double perimeter(){
		return 2* Math.PI * radius;
	}
}

class Rectangle extends Shapes{
	double width, height;
	
	Rectangle(String color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	
	double area() {
		return width * height;
	}
	double perimeter() {
		return 2 * (width + height);
	}
}

class Triangle extends Shapes{
	double base, height, side1, side2, side3;
	
	Triangle(String color, double base, double height, double side1, double side2, double side3){
		super(color);
		
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	double area() {
		return 0.5 * base * height; 
	}
	
	double perimeter() {
		return side1 + side2 + side3;
	}
}

class Square extends Rectangle{
	Square(String color, double side){
		super(color, side, side);
	}
=======
package default_package;

public class Shapes {
	
	String color;
	
	Shapes(String color){
		this.color = color;
	}
	
	double area() {
		return 0;
	}
	
	double perimeter() {
		return 0;
	}
	
	void displayInfo() {
		System.out.println("Shape: " + this.getClass().getSimpleName());
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
	}
	
	public static void main(String[] args) {
		
		Shapes[] shape = new Shapes[4];
		
		shape[0] = new Circle("Red" , 5);
		shape[1] = new Rectangle("Blue", 6 , 8);
		shape[2] = new Triangle("Green", 2, 4, 6, 8, 10);
		shape[3] = new Square("Orange", 8);
		
		for(Shapes s: shape) {
			s.displayInfo();
		}
		
	}

}

class Circle extends Shapes{
	double radius;
	
	Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	double area() {
		return Math.PI *radius*radius;
	}
	double perimeter(){
		return 2* Math.PI * radius;
	}
}

class Rectangle extends Shapes{
	double width, height;
	
	Rectangle(String color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	
	double area() {
		return width * height;
	}
	double perimeter() {
		return 2 * (width + height);
	}
}

class Triangle extends Shapes{
	double base, height, side1, side2, side3;
	
	Triangle(String color, double base, double height, double side1, double side2, double side3){
		super(color);
		
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	double area() {
		return 0.5 * base * height; 
	}
	
	double perimeter() {
		return side1 + side2 + side3;
	}
}

class Square extends Rectangle{
	Square(String color, double side){
		super(color, side, side);
	}
>>>>>>> 7ea7e141b6440b42900aaa9ff550f5905408bd3d
}