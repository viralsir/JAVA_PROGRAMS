package Arayan_mart;

/*
 home work :-

 level - 0
      add search by bill no in sub menu (purchase ,sales )
 level - 1
       add update by bill no and delete by bill no in sub menu(purchase,sales)
 level - 2
        combine or replace customer , vendor into order

 home work :-

 level - 0
      add search by bill no in sub menu (purchase ,sales )
 level - 1
       add update by bill no and delete by bill no in sub menu(purchase,sales)
 level - 2
        combine or replace customer , vendor into order




 */


import oop.Employee;
import oop.objectmemberdemo;

//import oop.*;
import oop.ticket.Booking;


import java.util.ArrayList;
import java.util.Scanner;


public class AryanMartDemo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Order> vendors=new ArrayList<>();
        ArrayList<Order> customers=new ArrayList<>();
        Employee employee=new Employee();

        int option1=0,option2=0;
        do {

            System.out.println("\n\t\t\t Aryan Mart ");
            System.out.println("\t\t Press 1 for Purchase");
            System.out.println("\t\t Press 2 for Sales");
            System.out.println("\t\t Press 3 for Exit");

            System.out.println("Enter Your option :");
            option1=scanner.nextInt();

            switch (option1)
            {
                case 1:
                      do {
                          System.out.println("\t\t\t Purchase");
                          System.out.println("\t\t Press 1 for Entry");
                          System.out.println("\t\t Press 2 for View");
                          System.out.println("\t\t Press 3 for Main Menu");

                          System.out.println("Enter your option :");
                          option2=scanner.nextInt();

                          switch (option2)
                          {
                              case 1:
                                     String option3="";
                                     do {
                                           Order vendor=new Order();
                                           vendor.setOrder("Vendor");
                                           vendors.add(vendor);

                                         System.out.println("Do you want to add another bill?(y/n):");
                                         option3=scanner.next();

                                     }while(option3.equalsIgnoreCase("y"));
                                     break;
                              case 2:
                                  System.out.println("\t\t View ");
                                  for(Order vendor:vendors)
                                  {
                                      vendor.getOrder("Vendor");
                                  }
                                  break;
                              case 3:
                                  System.out.println("Back to main menu");
                                  break;
                              default:
                                  System.out.println("Wrong option selected try again !!");
                                  break;
                          }

                      }while(option2!=3);
                      break;
                case 2:
                    do {
                        System.out.println("\t\t\t Sales");
                        System.out.println("\t\t Press 1 for Entry");
                        System.out.println("\t\t Press 2 for View");
                        System.out.println("\t\t Press 3 for Main Menu");

                        System.out.println("Enter your option :");
                        option2=scanner.nextInt();

                        switch (option2)
                        {
                            case 1:
                                String option3="";
                                do {

                                    Order customer=new Order();
                                    customer.setOrder("Customer");
                                    customers.add(customer);

                                    System.out.println("Do you want to add another bill?(y/n):");
                                    option3=scanner.next();

                                }while(option3.equalsIgnoreCase("y"));
                                break;
                            case 2:
                                System.out.println("\t\t View ");
                                for(Order customer:customers)
                                {
                                    customer.getOrder("Customer");
                                }
                                break;
                            case 3:
                                System.out.println("Back to main menu");
                                break;
                            default:
                                System.out.println("Wrong option selected try again !!");
                                break;
                        }

                    }while(option2!=3);
                    break;
                case 3:
                    System.out.println("you are exited");
                    break;
                default :
                    System.out.println("wrong option selected try again !!!");
                    break;

            }

        }while(option1!=3);


    }
}
