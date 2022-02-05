import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GradeStats 
{
  public static void main(String[] args) throws FileNotFoundException
  {
     String nameOfFile;

  Scanner input = new Scanner(System.in);
  System.out.print("Enter name of the file: ");
  nameOfFile = input.nextLine();

  try 
  {
   input = new Scanner(new File(nameOfFile));
  } catch (FileNotFoundException e) 
  {
   System.err.println(" File not found.");
   System.exit(0);
  }

  int size = 0;

  while(input.hasNextLine())
  {
   input.nextLine();
   size++;
  }

  input.close();
  input = new Scanner(new File(nameOfFile));


  double[] score = new double[size];
  while(input.hasNextLine())
  {
input.nextLine();
 }


  input.close();


  double number = 0;
  double addScore = 0;



    double[] gradeScore = new double[] {87.5, 47.9, 70.0, 91.6, 67.8, 83.3, 75.0, 96.0, 55.0,
      96.0, 54.7, 73.7, 60.0, 64.0 };


    System.out.println();
    System.out.println("Grade Summary");
    System.out.println();
    System.out.printf("Lowest Score: " + GetLowest(gradeScore));  
    System.out.println();
    System.out.println();
    System.out.println("Highest Score: " + GetHighest(gradeScore));
    System.out.println();
    System.out.printf("Average Score: %,.1f", + GetAverage(gradeScore));
    System.out.println();
    System.out.println();
    System.out.printf("Curve grade: %,.1f", GetCurve(gradeScore, number));
    System.out.printf("Added Points: %,.1f", GetPoints(gradeScore, addScore));


     int gradeA = 0;
     int gradeB = 0;
     int gradeC = 0; 
     int gradeD = 0;
     int gradeF = 0;


           for (int i = 0; i < gradeScore.length; i++)
           {

            if (gradeScore[i] >= 90.0)
            {
             gradeA++;
            }
            if (gradeScore[i] >= 80.0 && gradeScore[i] <= 90.0)
           {
             gradeB++;
           } 
            if(gradeScore[i] >= 70.0 && gradeScore[i] <= 80.0)
           {
             gradeC++; 
           }
            if(gradeScore[i] >= 60.0 && gradeScore[i] <= 70.0)
           {
             gradeD++; 
           }
            if(gradeScore[i] < 60.0)
           {
             gradeF++; 
           }

           }    
    System.out.println("Grade A:  " + gradeA);
    System.out.println("Grade B:  " + gradeB);
    System.out.println("Grade C:  " + gradeC);
    System.out.println("Grade D:  " + gradeD);
    System.out.println("Grade F:  " + gradeF);  

}


    public static double GetLowest(double[] myArray) 
    {

 double lowest = myArray[0];

 for (int i = 1; i < myArray.length; i++)
 {
   if (myArray [i] < lowest)
   {
     lowest = myArray [i];

   }
 }
 return lowest;
  }

    public static double GetHighest(double[] myArray) 
    {

 double highest = myArray[0];

 for (int i = 1; i < myArray.length; i++)
 {
   if (myArray [i] > highest)
   {
     highest = myArray [i];

   }
 }
 return highest;
  }

   public static double GetAverage (double[] myArray)
   {
     double total = 0;

    for (int i = 0; i< myArray.length; i++)
    {
      total = total + myArray[i];
    }

    double average = total / myArray.length;


    return average;
   }


   public static double[] GetCurve(double[] myArray, double curve) 
   {

  double []number = new double[myArray.length];
  for (int i = 1; i < myArray.length; i++)
  {
    number[i] = myArray[i] * 1.05;
  }

  return number;

 }

 public static double[] GetPoints(double[]score, double points) 
 {
  double [] addScore = new double [score.length];
  for( int i = 1; i < score.length; i++)
  {
   addScore[i] = score[i] + points;
  }

  return addScore;
 }
 /*
 int s_id = Integer.parseInt(jTextField1.getText());
 String s_name = jTextField2.getText();
 String s_sec = jTextField7.getText();
 double phy = Double.parseDouble(jTextField3.getText());
 double chem = Double.parseDouble(jTextField4.getText());
 double maths = Double.parseDouble(jTextField8.getText());
 double eng = Double.parseDouble(jTextField9.getText());

   
 double total = phy + chem + maths + eng;
 jTextField5.setText("" + total);
   
 double per = (total / 400) * 100;
 jTextField10.setText("" + per);
 String grade = null;

   
 if (per > 90) {
     grade = "A";
 } else if ((per > 85) && (per < 90)) {
     grade = "B";
 } else if ((per > 80) && (per < 85)) {
     grade = "C";
 } else if ((per > 70) && (per < 80)) {
     grade = "D";
 } else if ((per > 60) && (per < 70)) {
     grade = "E";
 } else if ((per > 50) && (per < 60)) {
     grade = "Poor";
 }
   
 jTextField6.setText("" + grade);
   

 jOptionPane1.showMessageDialog(null, "Hello: " + s_name + " of class: " + s_sec +
     "\nYour Grade is: " + grade);
     */
}