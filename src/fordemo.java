import java.util.Scanner;

/*
        for - iterator
        syntax :
        for(intitlization of varialbe; condition ;increment / decrement of variable)
        {
            statement;
           }

        for - each
 */
public class fordemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

//        for(int start=1;start<=5;start++)
//        {
//            System.out.println(start);
//        }

//        for(int start=1, j=2,k=1; start<=5  && (j<=3 || k<=5) ;start++,j++,k++)
//        {
//            System.out.println(start+j);
//        }
//        int i=1;
//        for(;;)
//        {
//            i++;
//            System.out.println(i);
//        }


//        System.out.println("Enter No:");
//        int no=scanner.nextInt();
//
//        for(int start=1;start<=10;start++)
//        {
//            System.out.println(no + " * " + start + " = " + start * no);
//            System.out.println("second statement");
//        }

//
//        for(int i=5;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }

        System.out.println("Enter Number:");
        int no=scanner.nextInt();

        for(int i=2;i<=2*no;i=i+2)
        {

            float mul=1.0f;
            for(int j=i;j>=1;j--)
            {
                mul=mul*j;
            }
            System.out.println("Factorial of "+i +" is "+ i/mul);
        }






    }
}
