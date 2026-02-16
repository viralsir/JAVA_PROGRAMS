import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
        size :  50

        Collection Class
             ArrayList  list=new ArrayList();

             list.add(1);
             list.add("vimal");
             list.add(34.33);

         object
                   (int) list.get(0)
                   (String) list.get(1)

          ArrayList<Integer> rollnolist=new ArrayList<Integer>();

            list.add(1);
            list.add(2);
            list.add(3);

            list.get(0);
            list.get(1);

           one di array

 */
public class CollectionDemo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer> rollno=new ArrayList<Integer>();
        ArrayList<String> name=new ArrayList<String>();
        ArrayList<Integer> maths=new ArrayList<Integer>();
        ArrayList<Integer> science=new ArrayList<Integer>();

        int option=0;
        do{
            System.out.println("\n\t\t SunShine Pvt Ltd");
            System.out.println("\t Press 1 for Entry");
            System.out.println("\t Press 2 for View");
            System.out.println("\t Press 3 for Exit");

            System.out.println("Enter Your Option :");
            option=scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("\t\t Entry");
                    String option2 = "";
                    do {
                        System.out.print("Enter Roll No:");
                        rollno.add(scanner.nextInt());
                        System.out.println("Enter Name:");
                        name.add(scanner.next());

                        System.out.println("Enter Maths Mark:");
                        int mark=scanner.nextInt();
                        while(mark<0 || mark>100){
                            System.out.println("invalid mark");
                            System.out.println("Enter Maths Mark:");
                            mark=scanner.nextInt();
                        }
                        maths.add(mark);

                        do {
                            System.out.println("Enter Science Mark:(0-100)");
                            mark = scanner.nextInt();
                        }while(mark<0 || mark>100);
                        science.add(mark);

                        System.out.println("Do you want to Continue(Y/N)?:");
                        option2 = scanner.next();

                    } while (option2.equalsIgnoreCase("Y"));
                    break;
                case 2:
                    System.out.println("\n \t\t View ");
                    for (int index = 0; index < rollno.size(); index++) {
                        System.out.println("Roll No:" + rollno.get(index));
                        System.out.println("Name:" + name.get(index));
                        System.out.println("Maths:" + maths.get(index));
                        System.out.println("Science:" + science.get(index));
                        if(maths.get(index)<35 || science.get(index)<35){
                            System.out.println("You are fail");
                        }
                        else{
                            System.out.println("You are Pass");
                        }

                    }
                    break;
                case 3:
                    System.out.println("You are Exited");
                    break;
                default:
                    System.out.println("Wrong option Selected Try again !!");
            }




            }while(option !=3);

        }







}
