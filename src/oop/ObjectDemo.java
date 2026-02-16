package oop;
/*
class : is a bunch of related data.
object : is a unique medium to access or get the data which binds together in a refreance class.

int no; (Primary Data type)
int no[5]; (Derived Data type)
student()  no (Abstract Data type or User define data type)

class is collection of related data (member variable) and it's behviour (member function)
class is collection of member variable and member function
class is a blueprint of data and it's behviour for object.

class student   (Prefreance)
{
   int  rollno
   String name
   int maths
   int science
   int english

}

each object has a unique copy of member variable of it's refereance class.

syntanx of object

student s1 = new student()    s1.rollno
student s2=new student()      s2.rollno

JVM
GC


 */

public class ObjectDemo
{
    // member variable
    int no;

    public static void main(String[] args)
    {
        ObjectDemo o1=new ObjectDemo();
        ObjectDemo o2=new ObjectDemo();
        ObjectDemo o3=o1;
        ObjectDemo o4=o2;
       // new ObjectDemo().no=34;
        o1.no=34;
        o1=o2;
        o2.no=56;
        o3=o4;
        o1.no=45;
        System.out.println(o3.no);


    }

}
