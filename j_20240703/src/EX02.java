import java.util.ArrayList;

interface Eatable{ }

class Fruit2 implements Eatable{
	public String toString() { return "Fruit"; }
}

class Grape2 extends Fruit2{
	public String toString() { return "Grape"; }
}

class Apple2 extends Fruit2{
	public String toString() { return "Apple";}
}

class Meat2 extends Fruit2{
	public String toString() { return "Meat"; }
}

class Stake2 extends Fruit2{
	public String toString() { return "Stake";}
}
                        
class Box2<T>{                                                   
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
		return list.toString();
	}
	
	class FruitBox<T extends Fruit2 & Eatable> extends Box2<T>{}
	
public class EX02 {
	public static void main(String[] args) {
		FruitBox<Fruit2> boxFruit = new FruitBox<Fruit2>();
		FruitBox<Apple2> boxApple2 = new FruitBox<Apple2>();
		FruitBox<Grape2> boxGrape = new FruitBox<Grape2>();
		
		//type parameter 의 type이 일치해야 함
		//FruitBox<Grape2> boxGrape = new FruitBox<Apple2>();
		
		//FruitBox<T extends Fruit2 &
	}
}
