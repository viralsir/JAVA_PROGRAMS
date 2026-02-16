import java.util.Scanner;

public class Student_do_loop_Demo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int maths=0;
        System.out.println("Enter Roll No:");
        int rollno=scanner.nextInt();
        System.out.println("Enter Name :");
        String name=scanner.next();
        do
        {

            System.out.println("Enter Maths Mark(0-100):");
            maths=scanner.nextInt();
            if(maths<0 || maths>100)
            {
                System.out.println("invalid maths mark");
            }

        }while(maths<0 || maths>100);

        System.out.println("Enter Science Marks:");
        int science=scanner.nextInt();

        System.out.println("output :");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);



    }
}
