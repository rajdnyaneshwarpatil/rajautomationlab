package coreJava;

public class UsingStaticVariable {

	static int counter = 0;
	
	UsingStaticVariable()
	{
		counter++;
		System.out.println(counter);
	}
	public static void main(String[] args) {
		
		UsingStaticVariable USV1 = new UsingStaticVariable();
		UsingStaticVariable USV2 = new UsingStaticVariable();
		UsingStaticVariable USV3 = new UsingStaticVariable();
		
		
	}
}
