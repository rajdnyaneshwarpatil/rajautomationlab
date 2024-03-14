package coreJava;

public class WithoutStaticVariable {
	
	int count=0;
	
	WithoutStaticVariable()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		WithoutStaticVariable WSV1 = new WithoutStaticVariable();
		WithoutStaticVariable WSV2 = new WithoutStaticVariable();
		WithoutStaticVariable WSV3 = new WithoutStaticVariable();
		
	}

}
