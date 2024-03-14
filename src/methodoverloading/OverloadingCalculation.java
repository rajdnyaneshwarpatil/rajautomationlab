package methodoverloading;

public class OverloadingCalculation {
	
	public void sum(int a, long b){
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		OverloadingCalculation O1 = new OverloadingCalculation();
		O1.sum(10, 20);
		O1.sum(10, 10, 10);
		
	}

}
