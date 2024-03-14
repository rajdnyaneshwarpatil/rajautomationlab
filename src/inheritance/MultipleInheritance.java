package inheritance;

class A{
	public void msg(){
		System.out.println("Hello");
	
}
}
class B{
	public void msg(){
		System.out.println("Welcome");
	}
}

public class MultipleInheritance extends A, B {
	
	public static void main(String[] args) {
		
		MultipleInheritance MP = new MultipleInheritance();
		MP.msg();
		

	}

}
