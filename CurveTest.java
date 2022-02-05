class CurveTest
{
   byte score;


CurveTest()
{
score=78;
}


public static void main(String arg[])

{
  CurveTest tst=new CurveTest();
   tst.processGrades();
}

public void processGrades()
{


if
(score >=75)
{
System.out.println("A");
}
else
if
((score >= 60)&&( score <75 )) 
{
System.out.println("B");
}
if
((score >=50 )&&(score<60))
{
System.out.println("C");
}
else
if
((score >=40 )&&(score  <50))
{
System.out.println("D");
}
else
if
(score <40 )
{
System.out.println("F");
}

}
}