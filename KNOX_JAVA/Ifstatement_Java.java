
public class Ifstatement_Java {

	public static void main(String[] args) {
		int age = 13;

		
		if(age>=13) {
			System.out.println("You are Teenager!");
		}
		else if(age>=18) {
			System.out.println("You are an adult!");			
		}
		else if(age>=60){
			System.out.println("You are Old!");
			System.out.println("Take a rest");
		}
		else {
			System.out.println("You are Child!");
		}
	}

}
