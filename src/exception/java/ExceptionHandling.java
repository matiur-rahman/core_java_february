package exception.java;

public class ExceptionHandling {

	
	public static void main(String[] args) {
		int number = 10, result;
		
		try{
			
		result = number/0;
		System.out.println(result);
		
		}catch(Exception e){
			System.out.println("logical runtime exception");
		}

	}

}
