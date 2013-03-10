package random.java;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	
	public static void main(String[] args) {
		System.out.println("please enter your needed numbers : ");
		Scanner sc = new Scanner(System.in);
		int limit= sc.nextInt();
		Random generator = new Random();
		int [] numbers = new int[limit];
		for(int i=0; i<numbers.length; i++){
			numbers[i]= generator.nextInt(1000);
		}
 
		for(int j=0; j<numbers.length; j++){
			System.out.println(numbers[j]);
		}
		
		
		
	}

}
