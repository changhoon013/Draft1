import java.util.Arrays;

import java.util.Scanner;

public class CurvePrototype {

 public static void main(String[] args) {


 Scanner scan = new Scanner( System.in );
    System.out.print("Number of students for test? ");
        int n = scan.nextInt();
        int [] scores = new int[n];

        for ( int i = 0; i < scores.length; i++ )

 {

     System.out.println( "Enter Score Number: "+ ( i + 1 ));

     scores[i] = scan.nextInt();
 }

    Arrays.sort(scores);
    System.out.println("Actual Scores:");
    for(int x = 0; x <= scores.length - 1; x++)
    {
         System.out.println(scores[x]);
    }
    System.out.println();
    curveScores(scores);

}


public static void curveScores(int[] s)
{
    int[] sortedScores = s;
    Arrays.sort(sortedScores);
        int curve = 100 - sortedScores[sortedScores.length - 1];
        System.out.println("Adjusted Scores:");
        for(int x = 0; x <= s.length - 1; x++)
    {
        System.out.println((s[x] + curve));
    }
}
}