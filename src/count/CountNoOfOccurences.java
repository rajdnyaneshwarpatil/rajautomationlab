package count;

public class CountNoOfOccurences {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Java is a java again";
		
		int count = S.length()- S.replace("a", "").length();
		System.out.println(S.replace("a","").length());
		System.out.println(S.replace("a",""));
		
		System.out.println("Occurences" +" "+ S +" "+  count);
		

	}

}
