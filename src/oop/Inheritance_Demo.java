package oop;

import java.util.ArrayList;
import java.util.Scanner;

/*
     Inheritance : is the proccess by which object of one class can access or get the
     properties of object of another class.

     category of Inheritance :
       1) Single Inheritance : one object can access or get the properties of only one object at a time.
                  A   parent class / super class / base class
                  |
                  B    child class / sub class / derived class




     class A
     {
        int noA;
       }
       class B extends A
       {
        int noB;
        }
        A a1=new A();
        a1.noA;
        a1.noB;
        B b1=new B();
        b1.noB
        b1.noA



 */
class Personal_info
{
    int id;
    String name;
    String address;

    void setPersonal_info()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Id:");
        id=scanner.nextInt();
        System.out.println("Enter Name:");
        name=scanner.next();
        System.out.println("Enter Address:");
        address=scanner.next();

    }
    void getPersonal_info()
    {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);

    }
}
class Employee_info extends Personal_info
{
    int salary;

    void setSalary()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Salary :");
        salary=scanner.nextInt();
    }
    void getSalary()
    {
        System.out.println("Salary :"+salary);
    }

}

public class Inheritance_Demo
{
    public static void main(String[] args) {

        ArrayList<Employee_info> employees=new ArrayList<>();

        Employee_info emp=new Employee_info();
        emp.setPersonal_info();
        emp.setSalary();

        emp.getPersonal_info();
        emp.getSalary();


    }
}
