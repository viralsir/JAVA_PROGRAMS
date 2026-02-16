import java.util.Scanner;

public class Array_Student_Demo_1
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;
        int rollno[]=new int[50];
        int maths[]=new int[50];
        int science[]=new int[50];
        int english[]=new int[50];
        String name[]=new String[50];

        for(int index=0;index<3;index++)
        {
            System.out.println("Enter Roll No:");
            rollno[index] = scanner.nextInt();
            System.out.println("Enter Name :");
            name[index] = scanner.next();
            System.out.println("Enter Maths Marks:");
            maths[index] = scanner.nextInt();
            while (maths[index] < 0 || maths[index] > 100) {
                System.out.println("Maths Marks should be between 1 to 100");
                System.out.println("Enter Maths Marks:");
                maths[index] = scanner.nextInt();
            }
            System.out.println("Enter Science Marks:");
            science[index] = scanner.nextInt();
            while (science[index] < 0 || science[index] > 100) {
                System.out.println("Science Marks should be between 1 to 100");
                System.out.println("Enter Science Marks:");
                science[index] = scanner.nextInt();
            }
            System.out.println("Enter English Marks:");
            english[index] = scanner.nextInt();
            while (english[index] < 0 || english[index] > 100) {
                System.out.println("English Marks should be between 1 to 100");
                System.out.println("Enter English Marks:");
                english[index] = scanner.nextInt();
            }

        }

        System.out.println("===== output ===");

        for (int index = 0; index < 3; index++)
        {

            System.out.println("Roll No:"+rollno[index]);
            System.out.println("Name :"+name[index]);
            System.out.println("Maths :"+maths[index]);
            System.out.println("English:"+english[index]);
            if(maths[index]>=PASSING_MARK && english[index]>=PASSING_MARK && science[index]>=PASSING_MARK)
            {
                int total=maths[index]+science[index]+english[index];
                float avg=total/3.0f;
                System.out.println("You are Pass");
                System.out.println("Total :"+total);
                System.out.println("Avg :"+avg);
            }
            else {
                System.out.println("You are Fail ");
            }


        }









    }

}
