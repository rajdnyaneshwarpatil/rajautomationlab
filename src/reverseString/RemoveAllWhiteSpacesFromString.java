package reverseString;

public class RemoveAllWhiteSpacesFromString {

	
	public static void main(String[] args) {
		
		String str = "Java is a Programming language";
		
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
	}

}
