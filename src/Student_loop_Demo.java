import java.util.Scanner;

public class Student_loop_Demo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Roll No:");
        int rollno=scanner.nextInt();
        System.out.println("Enter Name :");
        String name=scanner.next();
        System.out.println("Enter Maths Mark:");
        int maths=scanner.nextInt();
        while(maths<0 || maths>100)
        {
            System.out.println("invalid maths mark it should be between 0 to 100");
            System.out.print("Enter Maths Marks:");
            maths=scanner.nextInt();
        }
        System.out.println("Enter Science Marks:");
        int science=scanner.nextInt();

        System.out.println("output :");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);



    }
}
