package Arayan_mart;

import java.util.Scanner;

public class Personal
{
    int id;
    String name;
    String address;
    String phno;

    void setPersonal(String title)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter "+title+" ID:");
        id=scanner.nextInt();
        System.out.println("Enter "+title+" Name:");
        name=scanner.next();
        System.out.println("Enter "+title+" Address:");
        address=scanner.next();
        System.out.println("Enter "+title+" Phno:");
        phno=scanner.next();

    }

    void getPersonal(String title)
    {
        System.out.println(title+" ID:"+id);
        System.out.println(title+" Name:"+name);
        System.out.println(title+" Address:"+address);
        System.out.println(title+" Phno:"+phno);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
