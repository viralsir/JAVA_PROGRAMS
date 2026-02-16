import java.util.Scanner;

/*
     while within while  :

 */
public class nested_while_demo {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter No:");
        int no=scanner.nextInt();  // 5->9  , 6 -> 11 , 7 -> 13

//        System.out.println("Enter Starting Number:");
//        int start=scanner.nextInt();
//        System.out.println("Enter Ending Number:");
//        int end=scanner.nextInt();
       int i=1,k=1;
       while (i<= 2*no-1 )  // 9
       {
           int j=no+1;
           while(j>=1)
           {
               if( j > k)
               {
                   System.out.print(" ");
               }
               else {
                   System.out.print( j +" ");
               }

               j=j-1;
           }
           System.out.println("");
           if(i<no)
           {
               k=k+1;
           }
           else{
               k=k-1;
           }
           i=i+1;
       }


//        while (start<=end)
//        {
//            int repeat=1;
//            while (repeat<=10)
//            {
//                System.out.println(start+" x "+repeat+" = "+ start*repeat);
//                repeat=repeat+1;
//            }
//            System.out.println("==========================================");
//            start=start+1;
//        }

    }




}
/*
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5

 */
