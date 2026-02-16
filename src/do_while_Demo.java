import java.util.Scanner;

/*
    do while loop demo
    do while loop : entry
    while ,for : exit

    syntax :-
           intitalization of variable
           do
           {
               true part;
               statement;
               increment / decrement of variable;
             }while(condition);
 */
public class do_while_Demo
{
    public static void main(String[] args) {

//        int start=1;
//        do {
//            System.out.println(start);
//            start=start+1;
//
//        }while(start>=5);

        Scanner scanner=new Scanner(System.in);

//        System.out.println("Enter Starting Number:");
//        int start=scanner.nextInt();
//        System.out.println("Enter Ending Number:");
//        int end=scanner.nextInt();
//
//        do {
//            System.out.println(start);
//            start=start+1;
//
//        }while(start<=end);


//        System.out.println("Enter Number:");
//        int no=scanner.nextInt();
//        int start=1;
//        do {
//            System.out.println(no+" x "+start+" = "+no*start);
//            start=start+1;
//        }while(start<=10);

//        System.out.println("Enter Number:");
//        int no=scanner.nextInt();
//        System.out.println("Divisor :");
//        int start=1;
//        do {
//             if(no%start==0){
//                 System.out.println(start);
//             }
//             start=start+1;
//        }while(start<=no);

        int i=1,k=1;
        do {
            int j=6;
            do {
                  if(j>k)
                  {
                      System.out.print(" ");
                  }
                  else {
                      System.out.print(j+" ");
                  }

                j=j-1;
            }while(j>=1);
            System.out.println("");
            if(i<5)
                k=k+1;
            else
                k=k-1;
            i=i+1;
        }while(i<=9);


//        int i=1;
//        do {
//            int j=1;
//            do {
//                if(j<i)
//                {
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print(j+" ");
//                }
//
//                j=j+1;
//            }while(j<=6);
//            System.out.println("");
//            i=i+1;
//        }while(i<=5);











    }
}
