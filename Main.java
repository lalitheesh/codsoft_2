import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Grade Calculation\n");
        System.out.println("Enter your Marks out of 100:");
        float t=n.nextFloat();
        float a=n.nextFloat();
        float c=n.nextFloat();
        float s=n.nextFloat();
        float sum=(t+a+c+s);
        System.out.println("Total marks out of 100 is:"+sum);
        float avg=sum/4;
        System.out.println("Average Percentage is:"+avg);
        System.out.println("   GRADE   ");
        if(avg==100 && avg>=90)
        {
             System.out.println("Grade is : A");
        }
        else if(avg>=75 && avg<90)
        {
             System.out.println("Grade is : B");
        }
        else if(avg<75 && avg>=60)
        {
             System.out.println("Grade is : C");
        }
        else if(avg<60 && avg>=35)
        {
             System.out.println("Grade is : D");
        }
        else if(avg==0 && avg<35)
        {
             System.out.println("Grade is : E");
        }
    }
}
