package superKeyword;

// super keyword for invoking instance variable 

class Animal{
	String color = "white";
}

public class Dog extends Animal {
	String color = "Black";
	
	public void printcolor(){
		System.out.println(color);
		System.out.println(super.color);
	}
	
	public static void main(String[] args) {
		Dog D = new Dog();
		D.printcolor();
	}

}
