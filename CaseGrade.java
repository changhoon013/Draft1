import java.util.Scanner;

public class CaseGrade {

	public static void main(String[] args) {
		Scanner input =  new Scanner (System.in);
		String name ;
		int grade;
		String exellent = "Exellent :";
		String veryGgood ="Very Good :";
		String good="Good :";
		String pass ="Pass :";
		String fail = "Fail :";
	
		int max = 0;
		int min = 100;
		int sum = 0;
		int avg ;
		int counter =0;
		
		boolean repeat ;
		while (repeat =true)
		{
			System.out.println("Enter Name : ");
			name =  input.next();
			System.out.println("Enter Grade : ");
			grade = input.nextInt();
			
			if (grade == -1 )
			{
				avg = sum / counter;
				System.out.println(" result = :");
				System.out.println(exellent +"\n"+ veryGgood +"\n"+ good +"\n"+ pass +"\n"+fail);
				System.out.println("maximum = "+ max +"\t");
				System.out.println("minimum = "+ min +"\t");
				System.out.println("\tAverage = " +avg);
				System.exit(0);
			}
			
			
			
			switch (grade/10)
			{
			case 100:
			case 9 :
				exellent += "\n"+ name + "\t" +grade+"\n";
			
				break;
			case 8 :
				veryGgood += "\n" + name + "\t" +grade +"\n";
			
				break ;
			
			case 7 :
				good += "\n" + name + "\t" +grade +"\n";
				
				break;
			case 6:
			case 5:
				pass += "\n" + name + "\t" +grade +"\n";
				break;

				default:
				fail +="\n" + name + "\t" +grade +"\n";
				break;

			}
			
			sum = sum + grade;
			counter = counter + 1;
		
			if (grade > max) 
			{
				max = grade;
			}
			if (grade < min)
			{
				min = grade;
			}
	
		}
	}

}