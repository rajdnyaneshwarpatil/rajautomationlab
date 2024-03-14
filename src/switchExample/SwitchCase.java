package switchExample;

public class SwitchCase {

	public static void main(String[] args) {
		int age = 18;
		
		switch(age)
		{
		case (16):
			System.out.println("You are under 18");
			break;
		case (18):	
			System.out.println("You are eligible for vote");
		    break;
		case (50):
			System.out.println("You are senior citizen");
		    break;
		    
		default :
			System.out.println("Age is not valid");
			break;
		    
		}
	}

}
