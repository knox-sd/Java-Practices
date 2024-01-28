
public class changevariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "water";
		String y = "Oil";
		String temp = null;
		
		temp = x;
		x = y;
		y = temp;
		
//		x = y;
//		y = x;
		System.out.println("x: " + x);
		System.out.println("y: " + y); 
	}

}
