package Arayan_mart;

import java.util.ArrayList;
import java.util.Scanner;

public class AryanMartDemo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Vendor> vendors=new ArrayList<>();
        ArrayList<Customer> customers=new ArrayList<>();
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
                                           Vendor vendor=new Vendor();
                                           vendor.setVendor();
                                           vendors.add(vendor);

                                         System.out.println("Do you want to add another bill?(y/n):");
                                         option3=scanner.next();

                                     }while(option3.equalsIgnoreCase("y"));
                                     break;
                              case 2:
                                  System.out.println("\t\t View ");
                                  for(Vendor vendor:vendors)
                                  {
                                      vendor.getVendor();
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

                                    Customer customer=new Customer();
                                    customer.setCustomer();
                                    customers.add(customer);

                                    System.out.println("Do you want to add another bill?(y/n):");
                                    option3=scanner.next();

                                }while(option3.equalsIgnoreCase("y"));
                                break;
                            case 2:
                                System.out.println("\t\t View ");
                                for(Customer customer:customers)
                                {
                                    customer.getCustomer();
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
