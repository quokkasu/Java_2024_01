
//얕은 복사, 깊은 복사

class Circle implements Cloneable{
	//원의 중심점
	Point point;
	
	//반지름
	double radius;
	
	//생성자
	public Circle(Point point, double radius) {
		this.point = point;
		this.radius = radius;
	}
	
	//얕은 복사 메소드
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return (Circle)obj;
	}
	
	//깊은 복사 메소드
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		
		Circle c = (Circle)obj;
		c.point = new  Point(this.point.x, point.y);
		return (Circle)obj;
	}
	
	
	public String toString() {
		 return String.format("point : %s - r : %.2f%n", this.point, this.radius);
	}
	
}

//나는 왜 Formatter 라는게 생겼을까..? < 이로 인한 실행 오류 있음!
public class EX12 {
	public static void main(String[]args) {
		Point point = new Point(2, 4);
		 Circle c1 = new Circle(new Point(2, 4), 5.0);
		 Circle c2 = c1.shallowCopy();
		 
		 System.out.println("c1 : " + c1);
		 System.out.println("c2 : " + c2);
		 
		 System.out.println("c1 : " + c1.hashCode());
		 System.out.println("c2 : " + c2.hashCode());
		 
		 /*
		  c1 - 3, 6
		  c2 - 3, 6
		  */
		 System.out.println("==================================")
		 c1.point.x = 3;
		 c1.point.y = 6;
		 
		 System.out.println("c1 : " + c1);
		 System.out.println("c2 : " + c2);
		 
		 Circle c3 = c1.deepCopy();
		 
		 System.out.println("c1 : " + c1);
		 System.out.println("c3 : " + c3);
		 
		 System.out.println("c1 : " + c1.hashCode());
		 System.out.println("c3 : " + c3.hashCode());
		 
		 c1.point.x = 4;
		 c1.point.y = 8;
		 
		 System.out.println("c1 : " + c1);
		 System.out.println("c3 : " + c3);
	}
}
