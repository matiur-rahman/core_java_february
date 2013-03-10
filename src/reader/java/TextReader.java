package reader.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

	
	public static void main(String[] args)throws IOException {
		BufferedReader br= null;
		try {
		    br = new BufferedReader(new FileReader("/Users/mrahman/Documents/"));
			String st;
			while((st = br.readLine())!=null){
			System.out.println(st);
			}
			//int number = 2/0;
		} catch (Exception e) {
			br= new BufferedReader(new FileReader("/Users/mrahman/Documents/session.rtf")); 
			System.out.println("opened with 2nd attempt");
			String st;
			while((st = br.readLine())!=null){
			System.out.println(st);
			}
			e.printStackTrace();
		
		}finally{
			 
			 br.close();
			
		}

	}

}
