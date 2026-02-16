package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
    // member variable
    int rollno;
    String name;
    int maths;
    int science;





    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
//        Student student1 =new Student();
//        Student student2=new Student();
//
//        Student students[]=new Student[5];
//
//        for (int i = 0; i < 2; i++) {
//
//            students[i]=new Student();
//            System.out.println("Enter Student Roll No:");
//            students[i].rollno=scanner.nextInt();
//            System.out.println("Enter Student Name:");
//            students[i].name=scanner.next();
//            System.out.println("Enter Student Maths:");
//            students[i].maths=scanner.nextInt();
//            System.out.println("Enter Student Science:");
//            students[i].science=scanner.nextInt();
//
//        }
//        //Student student1;
//        System.out.println("output :");
//
//        for (int i = 0; i < 2; i++) {
//
//            System.out.println("Roll no:"+students[i].rollno);
//            System.out.println("Name:"+students[i].name);
//            System.out.println("Maths:"+students[i].maths);
//            System.out.println("Science:"+students[i].science);
//
//        }

        ArrayList<Student> studentlist=new ArrayList<>();

        for (int i = 0; i < 2; i++)
        {
            Student student=new Student();
            System.out.println("Enter Student Roll No:");
            student.rollno=scanner.nextInt();
            System.out.println("Enter Student Name:");
            student.name=scanner.next();
            do
            {
                    System.out.println("Enter Student Maths(0-100):");
                    student.maths = scanner.nextInt();

            }while (student.maths<0 || student.maths>100);

            System.out.println("Enter Student Science:");
            student.science=scanner.nextInt();

            studentlist.add(student);

        }

//        for (int i = 0; i < studentlist.size(); i++) {
//            Student student=studentlist.get(i);
//            System.out.println("Roll no:"+student.rollno);
//            System.out.println("Name:"+student.name);
//            System.out.println("Maths:"+student.maths);
//            System.out.println("Science:"+student.science);
//
//
//
//        }

        for(Student student:studentlist)
        {
            System.out.println("Roll no:"+student.rollno);
            System.out.println("Name:"+student.name);
            System.out.println("Maths:"+student.maths);
            System.out.println("Science:"+student.science);

            if(student.maths<35 || student.science<35)
            {
                System.out.println("You are fail");
            }
            else {
                System.out.println("You are Pass");
            }
        }


    }


}
