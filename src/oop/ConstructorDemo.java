package oop;
/*
     Constructor : is a special function which is used to initialize the member variable
     it is by default called when the object of the same class is created.
     constructor name and class name must be same.
     it does not have any return type.

     C++ :- oop
     polymorphism : one name multiple use

     overloading
     constructor overloading

     function overloading


 */

class Ticket
{
     int id=20;

     // default constructor or non parameterise contructor
     Ticket()
     {
         id=10;
         System.out.println("constructor is called.");
     }
     // parameterise constructor
     Ticket(int tid)
     {
         id=tid;
         System.out.println("parameterise constructor is called");
     }


}

public class ConstructorDemo
{
    public static void main(String[] args) {

        Ticket ticket=new Ticket();
        Ticket ticket2=new Ticket(45);
        System.out.println(ticket.id);
        System.out.println(ticket2.id);

    }
}
