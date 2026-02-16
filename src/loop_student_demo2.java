import java.util.Scanner;

public class loop_student_demo2
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;
        int rollno=0,maths=0,science=0,english=0;
        String name="";

        int start=1;
        while (start<=3)
        {
            System.out.println("Enter Roll No:");
            rollno = scanner.nextInt();
            System.out.println("Enter Name :");
            name = scanner.next();
            System.out.println("Enter Maths Marks:");
            maths = scanner.nextInt();
            while (maths < 0 || maths > 100) {
                System.out.println("Maths Marks should be between 1 to 100");
                System.out.println("Enter Maths Marks:");
                maths = scanner.nextInt();
            }
            System.out.println("Enter Science Marks:");
            science = scanner.nextInt();
            while (science < 0 || science > 100) {
                System.out.println("Science Marks should be between 1 to 100");
                System.out.println("Enter Science Marks:");
                science = scanner.nextInt();
            }
            System.out.println("Enter English Marks:");
            english = scanner.nextInt();
            while (english < 0 || english > 100) {
                System.out.println("English Marks should be between 1 to 100");
                System.out.println("Enter English Marks:");
                english = scanner.nextInt();
            }
            start=start+1;
        }
        start=1;
        while(start<=3)
        {
            System.out.println("===== output ===");
            System.out.println("Roll No:"+rollno);
            System.out.println("Name :"+name);
            System.out.println("Maths :"+maths);
            System.out.println("English:"+english);
            if(maths>=PASSING_MARK && english>=PASSING_MARK && science>=PASSING_MARK)
            {
                int total=maths+science+english;
                float avg=total/3.0f;
                System.out.println("You are Pass");
                System.out.println("Total :"+total);
                System.out.println("Avg :"+avg);
            }
            else {
                System.out.println("You are Fail ");
            }

            start=start+1;
        }









    }

}
