import java.util.Scanner;

/*

        Conditional Control Structure

        1) if
                a)if else
                    syntax :
                            if (condition)
                            {
                                    true part;
                                    statement;
                             }
                             else
                             {
                                 false part;
                                 statement;
                               }
                b)else if
                c)nested if
        2) Switch

    Relational Operator

    Operator                symbol
    Grater than                 >
    Less than                   <
    Equal to                    ==
    Not Equal to                !=
    Grater than or
    equal to                    >=
    Less than or
    equal to                    <=

    Logical Operator
    Operator               symbol
    and                     &&
    or                      ||
    not                     !


 */
public class ControlStructureDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter No1:");
        int no1=scanner.nextInt();
        System.out.println("Enter No2:");
        int no2=scanner.nextInt();
        System.out.println("Enter No3:");
        int no3=scanner.nextInt();

        if(no1>0 && no2>0 && no3>0)
        {

            if (no1>no2 && no1>no3)
            {
                System.out.println(no1 + " is a maximum number");
            }
            else if(no2>no1 && no2>no3)
            {
                System.out.println(no2 +" is a maximum number");
            }
            else {
                System.out.println(no3+" is a maximum number ");
            }
        }
        else {
            System.out.println("invalid input");
        }







    }
}
