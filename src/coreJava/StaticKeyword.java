package coreJava;

public class StaticKeyword {

	int rollno;
	String name;
	static String collage = "RCPIT";
	
	StaticKeyword(int i, String n)
	{
		rollno = i;
		name = n;
	}
	
	public void displayRecord()
	{
		System.out.println(rollno + " " + name + " " + collage);
	}
	
	
	public static void main(String[] args) {
		
		StaticKeyword SK = new StaticKeyword(01, "Raj");
		SK.displayRecord();

	}

}
