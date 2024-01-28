public class Switch_Java{
	
	public static void main(String[] args) {
		//Switch = statement that allow a variable to be tested for equality against a list of value
		String day = "Friday"; // change the target day
		
		switch(day) {
			case "Sunday": System.out.println("It is Sunady");
			break;
			case "Monday": System.out.println("It is Mondya");
			break;
			case "Tuesday": System.out.println("It is Tuesday");
			break;
			case "Wednesday":System.out.println("It is Wednesday");
			break;
			case "Thursday":System.out.println("It is Thursday");
			break;
			case "Friday": System.out.println("It is Friday");
			break;
			case "Saturday": System.out.println("It is Saturday");
			default: System.out.println("That is not a Day!!"); // wrong input return default value
		}
	}
}