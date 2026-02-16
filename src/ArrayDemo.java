import java.util.Scanner;

/*

    Data type
    Array is a derived data type
    syntax :
             datatype  arrayname[]=new datatype[size];


        Array : is a shared name of multiple memorroy block.
           or
           collection of same type of data.

           two di array : array of array
           each element of an array is itself an array.

 */
public class ArrayDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        // initialization of array
        //int no[]={23,33,44,55,66};

        // declare the array one di array
//        int no[]=new int[5];
//
//        for (int index = 0; index < 4; index++) {
//
//            System.out.print("Enter Number:");
//            no[index]=scanner.nextInt();
//        }

      //  System.out.println("output :");
//        for (int index = 0; index < 4; index++) {
//            System.out.println(no[index]);
//
//        }

//        for(int value:no){
//            System.out.println(value);
//        }



//        System.out.println(no[1]);
//        System.out.println(no[3]);
//        System.out.println(no[7]);

        // initialization of multidi array
        //int no[][]={ {23,3},{ 4,56,66},{34,54,69}};

        // declare the two di array
        int no[][]=new int[2][4];
        //{ {23,23,44,55}, {34,4,5,5}}

        for(int outerindex=0;outerindex<2;outerindex++)
        {
            for (int inerindex = 0; inerindex < 4; inerindex++) {
                System.out.print("Enter Number:");
                no[outerindex][inerindex]=scanner.nextInt();

            }
        }

        System.out.println("output :");

        for(int outerindex=0;outerindex<2;outerindex++)
        {
            for (int inerindex = 0; inerindex < 4; inerindex++)
            {
                System.out.print(no[outerindex][inerindex]+" ");

            }
            System.out.println("");
        }

        System.out.println(no[1][2]);













    }
}
