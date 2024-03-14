package superKeyword;

class Animal1{
	public void eat(){
		System.out.println("Eating");
	}
}
public class Dog1 extends Animal1 {
	public void bark(){
		System.out.println("Barking");
	}
	
	public void eat(){
		System.out.println("Eating biscuits");
	}
	
	public void work(){
		super.eat();
	}
	
	public static void main(String[] args) {
		
		Dog1 D1 = new Dog1();
		D1.bark();
		D1.eat();
		D1.work();
	}

}
