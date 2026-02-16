import java.util.Scanner;

/*
    level :0
           add search by roll no option in main menu ( it will display only one record of roll no given by the user)
    level :1
           update record  by rollno in main menu (it will update record of rollno given by the user)
     level :2
            add standard  (save , display ,search ,update record standardwise)


 */

public class Array_Student_Demo_3
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        final int PASSING_MARK=35;
        int rollno[][]=new int[4][50];   // rollno[0][0]  rollno[div][divcount[div]]
        int maths[][]=new int[4][50];
        int science[][]=new int[4][50];
        int english[][]=new int[4][50];
        String name[][]=new String[4][50];
        int div_count[]={0,0,0,0};
        //int div_count[]={0,0,0,0}};

        int div=0;
        int menuoption=0;


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
                        System.out.println("\t\t Div Option ");
                        System.out.println("\t\t Press 0 for A Division");
                        System.out.println("\t\t Press 1 for B Division");
                        System.out.println("\t\t Press 2 for C Division");
                        System.out.println("\t\t Press 3 for D Division");

                        System.out.println("Enter Div Option:");
                        div=scanner.nextInt();


                        System.out.println("Enter Roll No:");
                        rollno[div][div_count[div]] = scanner.nextInt();
                        System.out.println("Enter Name :");
                        name[div][div_count[div]] = scanner.next();
                        System.out.println("Enter Maths Marks:");
                        maths[div][div_count[div]] = scanner.nextInt();
                        while (maths[div][div_count[div]] < 0 || maths[div][div_count[div]] > 100) {
                            System.out.println("Maths Marks should be between 1 to 100");
                            System.out.println("Enter Maths Marks:");
                            maths[div][div_count[div]] = scanner.nextInt();
                        }
                        System.out.println("Enter Science Marks:");
                        science[div][div_count[div]] = scanner.nextInt();
                        while (science[div][div_count[div]] < 0 || science[div][div_count[div]] > 100) {
                            System.out.println("Science Marks should be between 1 to 100");
                            System.out.println("Enter Science Marks:");
                            science[div][div_count[div]] = scanner.nextInt();
                        }
                        System.out.println("Enter English Marks:");
                        english[div][div_count[div]] = scanner.nextInt();
                        while (english[div][div_count[div]] < 0 || english[div][div_count[div]] > 100) {
                            System.out.println("English Marks should be between 1 to 100");
                            System.out.println("Enter English Marks:");
                            english[div][div_count[div]] = scanner.nextInt();
                        }

                        System.out.println("Do you want to Continue(Y/N):");
                        option=scanner.next();
                        div_count[div]++;
                    }while(option.equalsIgnoreCase("y" ));
                break;
                case 2:
                        System.out.println("\t\t View");
                        System.out.println("\t\t Div Option ");
                        System.out.println("\t\t Press 0 for A Division");
                        System.out.println("\t\t Press 1 for B Division");
                        System.out.println("\t\t Press 2 for C Division");
                        System.out.println("\t\t Press 3 for D Division");

                        System.out.println("Enter Div Option:");
                        div=scanner.nextInt();

                    for (int count = 0; count < div_count[div]; count++)
                    {

                        System.out.println("Roll No:"+rollno[div][count]);
                        System.out.println("Name :"+name[div][count]);
                        System.out.println("Maths :"+maths[div][count]);
                        System.out.println("English:"+english[div][count]);
                        if(maths[div][count]>=PASSING_MARK && english[div][count]>=PASSING_MARK && science[div][count]>=PASSING_MARK)
                        {
                            int total=maths[div][count]+science[div][count]+english[div][count];
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
