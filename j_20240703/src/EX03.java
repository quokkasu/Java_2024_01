import java.util.ArrayList;

class Fruit3 implements Eatable{
	public String toString() { return "Fruit"; }
}

class Grape3 extends Fruit3{
	public String toString() { return "Grape"; }
}

class Apple3 extends Fruit3{
	public String toString() { return "Apple";}
}

class Meat3 extends Fruit3{
	public String toString() { return "Meat"; }
}

class Stake3 extends Fruit3{
	public String toString() { return "Stake";}
}
class Ade{
	String name;
	Ade(String name){
		this.name = name + "Ade";
	}
	public String toString() {
		return this.name;
	}
}

class MakingAde{
	//메소드의 parameter로 type parameter 선언하기
	public static Ade makeAde(FruitBox3<? extends Fruit3> box) {
		String fruitName = "";
		for(Fruit3 fruit : box.getList()) {
			
		}
	}
}
class Box3<T>{                                                   
	ArrayList<T> list = new ArrayList<>();    
	void add(T t) {
		list.add(t);
	}
	T get(int i) {
		return list.get(i);
	}
	ArrayList<T> getList(){
		return this.list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
	
	
	//<T extends Fruit3>
	//  ㄴ type parameter로 Fruit3의 객체나 Fruit3의 자식객체가 들어올 수 있음
	class FruitBox3<T extends Fruit2 & Eatable> extends Box2<T>{ }
	
public class EX03 {
	public static void main(String [] args) {
		FruitBox3<Fruit3> boxFruit = new FruitBox3<Fruit3>();
		FruitBox3<Apple3> boxFruit = new FruitBox3<Apple3>();
		FruitBox3<Grape3> boxFruit = new FruitBox3<Grape3>();
		//FruitBox3<T extends Fruit3>
		//					ㄴFruit3 나 Furit3의 자식클래스만 지정할 수 있음
		//FruitBox3<Stake3> boxStake = new FruitBox
		FruitBox3<Stake3> boxFruit = new FruitBox3<Stake3>();
		
		boxFruit.add(new Apple3());
		boxFruit.add(new Fruit3());
		boxFruit.add(new Grape3());
	}
		MakingAde.makeAde(FruitBox3<? extends Fruit3> box){
			
		}
		MakingAde.makeAde(boxFruit);
		MakingAde.makeAde(boxApple);
		MakingAde.makeAde(boxGrape);
	}
}
class 