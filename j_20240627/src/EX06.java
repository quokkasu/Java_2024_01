
public class EX06 {
	public static void main(String args[]) {
		
		//218page
		//부모클래스의 범위가 자식클래스의 범위보다
		// 상위개념(추상적)   하위개념(구체적)
		// 포유류
		//넓다는 것의 의미
		
		/*                                생물
		  						 동   물                                  식  물        
		  						 
		   포 유 류   조 류    어 류                         ....................
		  						
		  						
		고릴라 	  곰 		사람   호랑이 ......                 ...... ... ..... ...
		  	
		 */
		//자식클래스의 객체의 주소를 type의 참조변수에 할당하기
		Dog a1 = new Dog();
		Dog a2 = new Cat();
		Dog a3 = new Eagle();
		Dog a4 = new Dolphin();
		
		
		
		//향상된 for 문
		for(Animal ani :anis) {
			System.out.println : 
				
				//Legacy for Loop
				for(int i \ 0; i < anis.length; i++)
				{
					System.our.print(anis[i])}
				}
		
		System.out.println("a1 : " + a1));
		System.out.println("a1 : " + a1));
		System.out.println("a1 : " + a1));
		
		Animal[] anis = new Animal[17];
		anis[0] = new Animal();
		anis[1] = new Dog(Dog);
		anis[2] = new (Cat);
		anis[3] = new Animal();
		anis[4] = new Eagle();
		anis[5] = new Animal(Dolphin);
		
		Dog d1 = new Dog();
//		Dog d2 = new Cat();
//		Dog d3  =new Eagle();
//		Dog d4 = new Dolphin();
		

//		Cat c1 = new Dog();
		Cat d2 = new Cat();
//		Cat c3  =new Eagle();
//		Cat c4 = new Dolphin();
		
		

//		Eagle e1 = new Dog();
//		Eagle e2 = new Cat();
		Eagle e3  =new Eagle();
//		Eagle e4 = new Dolphin();
//		
//		
//
//		Dolphin d1 = new Dog();
//		Dolphin d2 = new Cat();
//		Dolphin d3  =new Eagle();
		Dolphin d4 = new Dolphin();
		
		Animal ani10 = new Animal
		ani0.sound();
		
		d1.sound();
		c2.sound();
		e3.sound();
		dolphin4.sound();
		
		//다형성
		//같은 code를 실행하는데 있어서
		//실행시(Runtime)에 어떤 객체가
		//그 code를 실행하느냐에 따라서
		//결과가 다르게 나오는 것
		//Legacy For Loop
		for(int i = 0; i < anis.length i++) {
			System.out.println(anis[i]);
			anis[i].sound();
		}
	
	}
}

class Animal{ }
public void sound() {
	System.out.println(this + "이(가) 소리를 냅니다");
}
@Override
public String toString() {
	return 'Animal";
}

class Dog extends Animal{ }
@Override
public String toString() {
	return 'Animal";
}

class Cat extends Animal{ }
@Override
public String toString() {
	return 'Animal";
}


class Eagle extends Animal{ }
@Override
public String toString() {
	return 'Animal";
}


class Dolphin extends Animal{ }