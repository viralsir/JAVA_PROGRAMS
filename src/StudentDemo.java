import java.util.Scanner;

public class StudentDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Roll No:");
        int rollno=scanner.nextInt();
        System.out.print("Enter Name:");
        String name=scanner.next();
        System.out.print("Enter Maths Marks:");
        int maths=scanner.nextInt();
        if(maths<0 || maths>100)
        {
            System.out.println("invalid marks it should be between 0 to 100.");
            System.out.println("Enter Maths Marks:");
            maths=scanner.nextInt();
        }
        System.out.print("Enter Science Marks:");
        int science=scanner.nextInt();
        if(science<0 || science>100)
        {
            System.out.println("invalid marks it should be between 0 to 100.");
            System.out.println("Enter Science marks:");
            science=scanner.nextInt();

        }


        System.out.println("==== output ====");
        System.out.println("Roll No:"+rollno);
        System.out.println("Name :"+name);
        System.out.println("Maths :"+maths);
        System.out.println("Science :"+science);

        if (maths>=35 && science>=35)
        {
            System.out.println("You are Pass");
            int total=maths+science;
            float avg=total/2.0f;
            System.out.println("Total :"+total);
            System.out.println("Avg :"+avg);
            if (avg>=90)
            {
                System.out.println("Grade : A");

            }
            else if(avg>=70)
            {
                System.out.println("Grade :B");
            }
            else if(avg>=55)
            {
                System.out.println("Grade :C");
            }
            else
            {
                System.out.println("Grade :D");
            }

        }
        else
        {
            if(maths<35)
            {
                System.out.println("You are Fail in Maths");
            }
            if(science<35)
            {
                System.out.println("You are Fail in Science");
            }




        }






    }
}
