import java.util.Scanner;

/*
    circular control structure

    Loop :
       1)While Loop
                syntax :
                        initialization of variable
                        while (condition)
                        {
                            true part;
                            statement;
                            increment /decrement of variable;
                         }
       2)Do while Loop
       3)For loop



 */
public class LoopDemo {

    public static void main(String[] args) {

//        int start=50;
//        while(start>=0)
//        {
//            System.out.println(start);
//            start=start-10;
//        }

        Scanner scanner=new Scanner(System.in);

//        System.out.print("Enter Strating number:");
//        int start=scanner.nextInt();
//        System.out.println("Enter Ending Number:");
//        int end=scanner.nextInt();
//        while (start<=end)
//        {
//            System.out.println(start);
//            start=start+1;
//        }

//        int sum=0;
//        int start=1;
//        while(start<=5)
//        {
//            System.out.print("Enter Number:");
//            int no=scanner.nextInt();
//            sum=sum+no;
//            start++;
//        }
//        System.out.println("Sum :"+sum);


//        System.out.print("Enter Number:");
//        int no=scanner.nextInt();
//
//        int start=1;
//        while(start<=15)
//        {
//            System.out.println(no+" x " + start + " = "+ start*no);
//            start=start+1;
//        }

//        System.out.println("Enter Number :");
//        int no=scanner.nextInt();
//        System.out.println("divisor :");
//        int start=1;
//        while(start<=no)
//        {
//            if(no%start==0)
//            {
//                System.out.println(start);
//            }
//            start=start+1;
//        }


//        System.out.println("Enter Number :");
//        int no=scanner.nextInt();
//        System.out.println("divisor :");
//        int start=1;
//        int divisor_count=0;
//        while(start<=no)
//        {
//            if(no%start==0)
//            {
//               // System.out.println(start);
//                divisor_count++;
//            }
//            start=start+1;
//        }
//        if(divisor_count==2)
//        {
//            System.out.println(no+" is a prime number");
//        }
//        else {
//            System.out.println(no+" is a not prime number");
//        }

//        System.out.println("Enter Number :");
//        int no=scanner.nextInt();
//        System.out.println("divisor :");
//        int start=2;
//        boolean is_prime=true;
//        while(start<no)
//        {
//            if(no%start==0)
//            {
//                // System.out.println(start);
//                is_prime=false;
//            }
//            start=start+1;
//        }
//        if(is_prime==true)
//        {
//            System.out.println(no+" is a prime number");
//        }
//        else {
//            System.out.println(no+" is a not prime number");
//        }

        System.out.println("Enter Number :");
        int no=scanner.nextInt();
        System.out.println("divisor :");
        int start=2;
        boolean is_prime=true;
        while(start<no)
        {
            System.out.println(start);
            if(no%start==0)
            {
                // System.out.println(start);
                is_prime=false;
                break;
            }
            start=start+1;
        }
        if(is_prime==true)
        {
            System.out.println(no+" is a prime number");
        }
        else {
            System.out.println(no+" is a not prime number");
        }





        System.out.println("while loop ends");

    }

}
