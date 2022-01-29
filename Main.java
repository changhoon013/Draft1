import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        GradeDistribution grades = new GradeDistribution();

        System.out.println("Type exam scores, -1 to end");
        while (reader.hasNextInt()) {
            int number = reader.nextInt();
            if (number == -1) {
                break;
            }
            grades.add(number);
        }

        grades.print();
        System.out.println(grades.getAcceptedPercent());
    }
}