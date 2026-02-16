import java.util.Scanner;

public class Array_Student_Demo_2
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;
        int rollno[]=new int[50];
        int maths[]=new int[50];
        int science[]=new int[50];
        int english[]=new int[50];
        String name[]=new String[50];
        int menuoption=0;
        int index=0;

        do
        {
            System.out.println("\n\t\t\t Modi School Pvt Ltd");
            System.out.println("\t\t Press 1 for Entry");
            System.out.println("\t\t Press 2 for View");
            System.out.println("\t\t Press 3 for Exit");

            System.out.println("Enter Your Option :");
            menuoption=scanner.nextInt();

            switch (menuoption)
            {
                case 1:
                    String option="";
                    do
                    {
                        System.out.println("\t\t\t  Entry ");
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

                        System.out.println("Do you want to Continue(Y/N):");
                        option=scanner.next();
                        index++;
                    }while(option.equalsIgnoreCase("y" ));
                break;
                case 2:
                    System.out.println("\t\t View");
                    for (int count = 0; count < index; count++)
                    {

                        System.out.println("Roll No:"+rollno[count]);
                        System.out.println("Name :"+name[count]);
                        System.out.println("Maths :"+maths[count]);
                        System.out.println("English:"+english[count]);
                        if(maths[count]>=PASSING_MARK && english[count]>=PASSING_MARK && science[count]>=PASSING_MARK)
                        {
                            int total=maths[count]+science[count]+english[count];
                            float avg=total/3.0f;
                            System.out.println("You are Pass");
                            System.out.println("Total :"+total);
                            System.out.println("Avg :"+avg);
                        }
                        else {
                            System.out.println("You are Fail ");
                        }

                        System.out.println("================================");
                    }
                break;
                case 3:
                    System.out.println("you are exited");
                    break;
                default:
                    System.out.println("Wrong option selected try again !!");
                    break;
            }




        }while(menuoption !=3);


    }

}
