import java.util.ArrayList;

class Fruit{
	public String toString() { return "Fruit"; }
}

class Grape extends Fruit{
	public String toString() { return "Grape"; }
}

class Apple{
	public String toString() { return "Apple";}
}

class Meat{
	public String toString() { return "Meat"; }
}

class Stake{
	public String toString() { return "Stake";}
}
                        
class Box<T>{                                                   
	ArrayList<T> list = new ArrayList<>();    
	void add(T t) {
		list.add(t);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return.list.toString();
	}
}             
public class EX01 {
	public static void main(String[] args) {                                                                            
		
		//box 클래스의 type parameter 인 <T>에는
		//어떤 클래스의 객체(의 주소)도 다 들어올
		//Box box = new Box();
		
		Box<Fruit> boxFruit = new Box<Fruit>();
		Box<Apple> boxApple = new Box<Apple>();
		Box<Grape> Grape = new Box<Grape>();
		
		//type parameter의 type이 일치해야 함
		//Box<Grape> boxGrape = new Box<Apple>();
		Box<Grape> boxStake = new Box<Stake>();
		
		boxFruit.add new Fruit();
		boxFruit.add new Fruit();
		boxFruit.add new Fruit();
		
		boxApple.add new Apple();
		boxGrape.add new Grape();
	}
}
