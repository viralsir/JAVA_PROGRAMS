import java.util.Scanner;

public class InputDemo
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter No1:");
        int no1=scanner.nextInt();
        System.out.println("Enter Name:");
        String name=scanner.next();


        System.out.println("No1 :" + no1);
        System.out.println("Name:"+name);

    }
}
