import java.util.Scanner;

public class ComparingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        System.out.println("How is the weather?");
	        Scanner sc = new Scanner(System.in);
	        String answer = sc.nextLine();

	        if (answer.equalsIgnoreCase("rain"))
	            System.out.println("Take your umbrella!");
	        else if (answer.equalsIgnoreCase("windy"))
	            System.out.println("Wear your jacket!");
	        else if (answer.equalsIgnoreCase("snow"))
	            System.out.println("Wear a coat and take a shovel!");
	        else if (answer.equalsIgnoreCase("stormy"))
	            System.out.println("You should stay in side!");
	        else
	            System.out.println("Enjoy your day!");
	     }

	}

