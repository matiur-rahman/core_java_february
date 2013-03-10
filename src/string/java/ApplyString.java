package string.java;

public class ApplyString {

	
	public static void main(String[] args) {
		
		String name = "ABCDEFGH ";
		String state = "New York";
		System.out.println(name);
		System.out.println(name.charAt(1));
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.compareTo("BCDEFGH"));
		System.out.println("After concatination : " + name.concat(state));
		

	}

}
