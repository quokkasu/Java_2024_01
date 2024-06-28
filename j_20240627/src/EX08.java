
public class EX08 {
	 public static void main (String args[]) {
		 Animal1 animal = new Animal1();
		 Dog1 dog = new Dog1();
		 Cat1 cat = new Cat1();
		 Pooh1 pooh = new Pooh1();
		 
		 Playground pg = new Playground();
		 pg.play(animal);
		 pg.play(Dog);
		 pg.play(Cat);
		 pg.play(Pooh);
		 
	 }
}
class PlayGround{
	public void play(Animal1 animal) {
		System.out.println(animal + "이(가) 신나게 놉니다");
	}//public void play(Animal1 animal)
	
}//class PlayGround

class Animal1{
	@Override
	public String toString(){
		return "Animal";
	}
	}//class Animal1
}


class Dog1 extends Animal1{
	public String toString(){
		return "Dog1";
}//class Dog1 extends Animal1 dog
	
class Cat1 extends Animal1{
	public String toString(){
		return "Cat1";
}//class Cat1 extends Animal1 cat
	
class Poo1 extends Animal1{
	public String toString(){
		return "Pooh1";
}//public String toString()
	}//class Poo1 extends Animal1 pooh