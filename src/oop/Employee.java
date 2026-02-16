package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee
{
    // member variable
    int id;
    String name;
    String department;
    int salary;

    //member function
    void setEmployee()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Employee Id:");
        id=scanner.nextInt();
        System.out.println("Enter Employee Name:");
        name=scanner.next();
        System.out.println("Enter Employee Department :");
        department=scanner.next();
        System.out.println("Enter Employee Salary :");
        salary=scanner.nextInt();


    }

    void getEmployee()
    {
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Department :"+department);
        System.out.println("Employee Salary :"+salary);
    }


    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
//         Employee emp1=new Employee();
//         Employee emp2=new Employee();
//         emp1.setEmployee();
//         emp1.getEmployee();
//
//         emp2.setEmployee();
//         emp2.getEmployee();
//
         int option=0;
         ArrayList<Employee> employeeList=new ArrayList<>();
         do{
             System.out.println("\t\t Employee Info");
             System.out.println("\t Press 1 for Entry");
             System.out.println("\t Press 2 for View");
             System.out.println("\t press 3 for Search");
             System.out.println("\t Press 4 for Exit");

             System.out.println("Enter your option :");
             option=scanner.nextInt();

             switch(option)
             {
                 case 1:
                         String option2="";
                         do
                         {
                              Employee emp=new Employee();
                              emp.setEmployee();
                              employeeList.add(emp);

                             System.out.println("Do you want to Continue(Y/N)?:");
                             option2=scanner.next();

                         }while(option2.equalsIgnoreCase("y"));
                         break;
                 case 2:
                      for(Employee emp:employeeList){
                          emp.getEmployee();
                          System.out.println("=========================");
                      }
                      break;
                 case 3:
                     System.out.println("Enter Employee Id:");
                     int id=scanner.nextInt();
                     for(Employee emp:employeeList){
                         if(id==emp.id)
                         {
                             emp.getEmployee();
                             break;
                         }

                         System.out.println("=========================");
                     }
                     break;
                 case 4:
                     System.out.println("you are exited");
                     break;
                 default:
                     System.out.println("Wrong option selected try again !!");
                     break;
             }

         }while(option!=4);



    }
}
