package grade;

import javax.swing.*;
public class Grade
{
    private static String outputStr;
    public static void main(String[]args)
    {
        int test1,test2,test3,test4,test5,a,b,c,d,e,t,w,x,y,z;
        double average1,average2,average3;
        char A,B,C,D,F,Grade1,Grade2,Grade3;
        String student1Str,student2Str,student3Str,test1Str,test2Str,test3Str,test4Str,test5Str,aStr,bStr,cStr,dStr,eStr,tStr,wStr,xStr,yStr,zStr;

        {
        student1Str=JOptionPane.showInputDialog("Enter first student's name: ");
        student2Str=JOptionPane.showInputDialog("Enter second student's name: ");
        student3Str=JOptionPane.showInputDialog("Enter third student's name: ");
        test1Str=JOptionPane.showInputDialog("Enter the first score of the first student: ");
        test1=Integer.parseInt(test1Str);
        test2Str=JOptionPane.showInputDialog("Enter the second score of the first student: ");
        test2=Integer.parseInt(test2Str);
        test3Str=JOptionPane.showInputDialog("Enter the third score of the first student: ");
        test3=Integer.parseInt(test3Str);
        test4Str=JOptionPane.showInputDialog("Enter the fourth score of the first student: ");
        test4=Integer.parseInt(test4Str);
        test5Str=JOptionPane.showInputDialog("Enter the fifth score of the first student: ");
        test5=Integer.parseInt(test5Str);
        average1=(test1+test2+test3+test4+test5)/5;
        {
        if(average1>=90)
            Grade1='A';
        else if(average1>=80)
            Grade1='B';
        else if(average1>=70)
            Grade1='C';
        else if(average1>=60)
            Grade1='D';
        else
            Grade1='F';
        }


        }
        {
        aStr=JOptionPane.showInputDialog("Enter the first score of the second student: ");
        a=Integer.parseInt(aStr);
        bStr=JOptionPane.showInputDialog("Enter the second score of the second student: ");
        b=Integer.parseInt(bStr);
        cStr=JOptionPane.showInputDialog("Enter the third score of the second student: ");
        c=Integer.parseInt(cStr);
        dStr=JOptionPane.showInputDialog("Enter the fourth score of the second student: ");
        d=Integer.parseInt(dStr);
        eStr=JOptionPane.showInputDialog("Enter the fifth score of the second student: ");
        e=Integer.parseInt(eStr);
        average2=(a+b+c+d+e)/5;
        {
        if(average2>=90)
            Grade2='A';
        else if(average2>=80)
            Grade2='B';
        else if(average2>=70)
            Grade2='C';
        else if(average2>=60)
            Grade2='D';
        else
            Grade2='F';
        }
        }
        {
        tStr=JOptionPane.showInputDialog("Enter the first score of the second student: ");
        t=Integer.parseInt(tStr);
        wStr=JOptionPane.showInputDialog("Enter the second score of the second student: ");
        w=Integer.parseInt(wStr);
        xStr=JOptionPane.showInputDialog("Enter the third score of the second student: ");
        x=Integer.parseInt(xStr);
        yStr=JOptionPane.showInputDialog("Enter the fourth score of the second student: ");
        y=Integer.parseInt(yStr);
        zStr=JOptionPane.showInputDialog("Enter the fifth score of the second student: ");
        z=Integer.parseInt(zStr);
        average3=(t+w+x+y+z)/5;
        {
        if(average3>=90)
            Grade3='A';
        else if(average3>=80)
            Grade3='B';
        else if(average3>=70)
            Grade3='C';
        else if(average3>=60)
            Grade3='D';
        else
            Grade3='F';
        }
        }

        outputStr="Name: "+student1Str+"    "+"Average: "+average1+"    "+"Grade: "+Grade1+"\nName: "+student2Str+"   "+"Average: "+average2+"    "+"Grade: "+Grade2+"\nName: "+student3Str+"   "+"Average: "+average3+"    "+"Grade: "+Grade3;

        JOptionPane.showMessageDialog(null,outputStr,"Grade",JOptionPane.PLAIN_MESSAGE);


    }

}