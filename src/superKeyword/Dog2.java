package superKeyword;

class Animal11{
	Animal11(){
		System.out.println("animal is created");
	}
}

public class Dog2 extends Animal11 {
	Dog2(){
		super();
		System.out.println("dog is created");
		}
	
	public static void main(String[] args) {
		
		Dog2 D2 = new Dog2();
		
		

	}

}
