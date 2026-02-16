package oop;
/*
   function : - is a subprogram which help the main program to get the output.

   syntax :
             1) defination  :
                        return type  functionname(arg1,arg2,---,arn)
                        {
                                statement;
                                return value;
                         }
                         return type :
                          int : function will return integer value
                          float : function will return floating value
                          char : function will return character.
                          void : function does not return any value

             2) calling
                           var=functionname(parameter1,parameter2,====,parameterN)

   1)function with argument and with return value
   2)function with argument and without return value
   3)function without argument and with return value
   4)function without argument and without return value.


 */

import java.util.Scanner;

public class function_Demo
{
    // function with argument and with return value
//    static int total(int no1,int no2)
//    {
//
//        return no1+no2;
//        //return 0;
//    }

    // function with argument and without return value
//    static void total(int no1,int no2)
//    {
//        System.out.println("sum :"+ (no1+no2));
//        System.out.println("Avg :"+(no1+no2)/2);
//    }

    // function without argument and with return value
//    static int total()
//    {
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("Enter No1:");
//        int n1=scanner.nextInt();
//        System.out.println("Enter No2:");
//        int n2=scanner.nextInt();
//
//
//        return n1+n2;
//    }

// function without argument and without return value
    static void total()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter No1:");
        int n1=scanner.nextInt();
        System.out.println("Enter No2:");
        int n2=scanner.nextInt();

        System.out.println("Sum :"+(n1+n2));
    }



    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

//        System.out.println("Enter No1:");
//        int n1=scanner.nextInt();
//        System.out.println("Enter No2:");
//        int n2=scanner.nextInt();

//        System.out.println(total(12,23));
//        System.out.println(total(12,23)/2);
//      function with argument and with return value
//        int sum=total(n1,n2);
//        float avg=sum/2;
//
//        System.out.println("Sum :"+sum);
//        System.out.println("Avg :"+avg);

        // function with argument and without return value
       // total(n1, n2);

        // function without argument and with return value
      //  System.out.println(total());

        // function without argument and without return value
        total();

    }

}
