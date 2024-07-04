import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//456 PAGE

abstract class Shape implements Comparable<Shape>{
	
	int x,y;
	
	Shape(){
		this(0,0);
		
	}
	Shape(int x, int y{
		this.x = x;
		this.y = y;
	})
	
	abstract double area();
	abstract double length();
	public String getLocation() {
		return "x : " + x + "- y : " + y;
	}
	
	@Override
	public int compareTo(Shape shape) {
		return (int)(this.area() - shape.area());
	}
	
}//Shape

class Rectangle extends Shape{
	int whdth, height;
	Rectangle(){
		this(1,1);
	}
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {return this.width * this.height;}
	@Override
	double area() {return (this.width * this.height) *2;}
}

class Circle extends Shape{
	int radius;
	Circle(){
		this(1);
	}
	Circle(int radius){
		this.radius = radius;
		
	}
	@Override
	double area() {return this.radius * this.radius;}
	@Override
	double length() {return 2 * radius * Math.PI;}
	@Override
	public String toString() {
		return "넓이 : " + this.area(); 
	}
}
public class EX12 {
		public static void main(String[] args) {
			Shape s1 = new Rectangle(10,3);
			Shape s2 = new Circle(0);
			Shape s3 = new Rectangle(20,2);
			Shape s4 = new Circle(11);
			
			List<Shape> shapeList = Arrays.asList(s1,s2,s3,s4);
			System.out.println("shapeList : " + shapeList);
			
			System.out.println("---오름차순---");
			shapeList.stream().sorted().forEach(System.out::println);
			
			
			System.out.println("---내림차순---");
			shapeList.stream().sorted(Comparator.reverseOrder())
												.forEach(System.out::println);
			
			//459page
			shapeList = Arrays.asList(s1,s2,s3,s4);
			
			System.out.println("--정렬하지 않고 출력--");
			shapeList.stream().forEach(System.out::println);
			
		  System.out.println("--둘레 길이 순으로 출력(함수적 인터페이스)--");
		  shapeList.stream().sorted(new Comaparator<Shape>() {
		  	@Override
		  	public int compare(Shape s1, shape s2) {
		  		return(int) (s1.length() - s2.length());
		  	}
		  })forEach(System.out::println);
			
			
		}
}
