package methodoverloading;

class Adder1 {
	static int add(int a, int b){
		return a+b;
		}
	static double add(double d, double e, double f){
		return d+e+f;
		}
}

public class OverloadingTest1 {

	public static void main(String[] args) {
		
		System.out.println(Adder1.add(10, 10));
		System.out.println(Adder1.add(10.1, 10.2, 10.3));
		

	}

}
