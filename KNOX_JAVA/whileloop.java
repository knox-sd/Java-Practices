import java.util.Scanner;

public class whileloop {
    public static void main (String[] args){
        // while loop = execute a blook of code as long as a it's condition remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
    }
}
