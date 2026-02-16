import java.util.Scanner;

/*
     Arithmatic Operator

     Operator                   symbol
     Addition                   +
     Substraction               -
     Multiplication             *
     Division                   /
     Module                     %  - remainder



 */
public class ArithmaticOperatorDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       // System.out.println("Enter First Number :");
        int no1=scanner.nextInt();
        //System.out.println("Enter Second Number :");
        int no2=scanner.nextInt();

        int total=no1+no2;
        float avg= total/2.0f;
        System.out.println("Addition :"+ total );
        System.out.println("Avg :"+avg);

        System.out.println("Substraction :" + (no1-no2));
        System.out.println("Multiplication :"+ no1*no2);
        System.out.println("divison :" + (no1/no2));
        System.out.println("Module :"+ (no1%no2));


    }
}
