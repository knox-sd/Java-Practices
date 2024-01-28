import java.util.Random;
public class Random_value_Java {

	public static void main(String[] args) {
		Random random = new Random();
		
		int x = random.nextInt(6); //generate 1-5 number value
		int y = random.nextInt(6)+1; // generate 1-6 number value
		
		System.out.println(x);
		System.out.println(y);
		
		double a = random.nextDouble();
		System.out.println(a);
		
		boolean b = random.nextBoolean();
		System.out.println(b);

	}

}
