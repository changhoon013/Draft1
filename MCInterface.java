import java.util.Scanner;

public class MCInterface {
	public static void main(String[] args) {
	    String[] mC1;
	    Scanner input = new Scanner(System.in);

	    mC1 = new String[5];
	    mC1[0] = "1. Which NFL team is located in San Fransisco?\n";
	    mC1[1] = "";
	    mC1[2] = "";
	    mC1[3] = "";
	    mC1[4] = "";

	    String userSelect1 = mC1[0];

	    if(userSelect1==mC1[0]){
	        System.out.println(mC1[0]);
	        System.out.println("A. Steelers");
	        System.out.println("B. 49ers");
	        System.out.println("C. Vikings");
	        System.out.println("D. Chargers");
	        System.out.println();
	        System.out.print("Your answer: ");
	        String uSelect1 = input.next();

	        switch (uSelect1.toUpperCase()){
	            case "A":
	                uSelect1 = "Steelers";
	                System.out.println("Incorrect\n\n");
	                break;
	            case "B":
	                uSelect1 = "49ers";
	                System.out.println("Correct\n\n");
				int scorePro = 0;
				scorePro++;
				int score = 0;
				score++;
	                break;
	            case "C":
	                uSelect1 = "Vikings";
	                System.out.println("Incorrect\n\n");
	                break;
	            case "D":
	                uSelect1 = "Chargers";
	                System.out.println("Incorrect\n\n");
	                break;
	            default: 
	                uSelect1 = "Incorrect, choice.\n\n";
	                break;
	        }
	    }
	    // more questions to be added
	}
}
