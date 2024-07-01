import java.util.Arrays;

//306page : clone()메소드

class Point implements Cloneable{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return String.format("x : %d = y : %d$n, x, y);
	}
	@Override
	public Object clone() {
		Object obj = null;
		try { 
			obj = super.clone();
		}catch(CloneNotSuppertedException e) { }
		 return obj;
	}
}
public class EX11 {
	public static void main(String[]args) {
		 Point original = new Point(10,20);
		 
		 //복제하면 새로운 객체가 생성됨
		 Point copyPoint = (Point)original.clone();
		 
		 System.out.println(original);
		 System.out.println(copyPoint);
		 System.out.println(original.hashCode());
		 System.out.println(copyPoint.hashCode());
		 System.out.println(System.identityHashCode());
		 System.out.println(System.identityHashCode());
		 System.out.println("==================================");
		 
		 String[] arr1 = new String[] {"홍길동","이순신","김유신","안중근"};
		 String[] arr2 = arr1.clone();
		 
	System.out.println("arr1 == arr2 : " + (arr1 == arr2));
	System.out.println("arr1 : " + arr1 );
	System.out.println("arr2 : " + arr2 );
	System.out.println("arr1 : " + Arrays.deepToString(arr1));
	System.out.println("arr2 : " + Arrays.deepToString(arr2));
	
	String[] arr3 = new String [arr1.length];
	System.arraycopy(arr1, 0, arr3, arr1.length);
	System.out.println("arr3 : " + Arrays.ToString(arr3));
	System.out.println("arr3 : " + arr3 );
	
	arr1[3] = "윤봉길";
	System.out.println("arr1 : " + Arrays.deepToString(arr1));
	System.out.println("arr2 : " + Arrays.deepToString(arr2));
	System.out.println("arr3 : " + Arrays.deepToString(arr3));
	}
}
