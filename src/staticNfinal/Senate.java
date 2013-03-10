package staticNfinal;

public class Senate {

	
	public static void main(String[] args) {
		PresidentNomination ch = new PresidentNomination();
		
		//ch.getNameOfDefenceSeceretary();
		ch.salary=150000;
		System.out.println("chuck hagel : " +ch.salary);
		
		PresidentNomination leonPanate = new PresidentNomination();
		leonPanate.salary=200000;
		System.out.println("leon Panate : "+leonPanate.salary);
		
		System.out.println("chuck hagel : "+ ch.salary);
		
		Congress con = new Congress();
		con.nominationProcess();
		con.nominationProcessToSupremeCourt(); 
		//con.salary=10000;
		System.out.println(con.salary);
	}

}
