package oop;
/*
when one object  is a member of another object.
 */

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

class subject
{
    int mark;
    String name;

    void setSubject(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Subject Name:");
        name=scanner.next();
        System.out.println("Enter Mark:");
        mark=scanner.nextInt();

    }
    void getSubject()
    {
        System.out.println(name+":"+mark);
    }

}
class Studentdetail
{
    int id;
    String name;
    // member
    //Subject subject=new Subject();
    ArrayList<subject> subjectlist=new ArrayList<>();

    void setStudentDetail()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student id:");
        id=scanner.nextInt();
        System.out.println("Enter Student Name:");
        name=scanner.next();
    }

    void getStudentDetails(){

        System.out.println("Student Id:"+id);
        System.out.println("Student Name:"+name);

    }

}

public class objectmemberdemo
{
    public static void main(String[] args)
    {
        Studentdetail student1=new Studentdetail();
        student1.setStudentDetail();

        System.out.println("Student 1 :");

        subject subject1=new subject();
        subject1.setSubject();
        student1.subjectlist.add(subject1);
        subject subject2=new subject();
        subject2.setSubject();
        student1.subjectlist.add(subject2);

        System.out.println("student 2:");

        Studentdetail student2=new Studentdetail();
        student2.setStudentDetail();

        subject1=new subject();
        subject1.setSubject();
        student2.subjectlist.add(subject1);
        subject2=new subject();
        subject2.setSubject();
        student2.subjectlist.add(subject2);


    }


}
