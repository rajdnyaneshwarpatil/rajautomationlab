package ifElseExample;

public class IfElseIf {

		public static void main(String[] args) {
		
			int marks = 10;
			
			if (marks<50)
			{
				System.out.println("Result is Fail");
			}
			
			else if(marks>=50 && marks<60)
			{
				System.out.println("Result is D Grade");
			}
			
			else if(marks>=60 && marks<70)
			{
				System.out.println("Result is C Grade");
			}
			
			else if(marks>=70 && marks<80)
			{
				System.out.println("Result is B Grade");
			}
			
			else if(marks>=80 && marks<90)
			{
				System.out.println("Result is A Grade");
			}
			
			else if(marks>=90 && marks<=100)
			{
				System.out.println("Result is A+");
			}
			
			else
			{
				System.out.println("Invalid!");
			}
	}

}
