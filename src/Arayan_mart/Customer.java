package Arayan_mart;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Personal
{
    int billno;
    String billdate;
    float totalamount,discount,tax,billamount;
    ArrayList<Product> products=new ArrayList<>();


    void setCustomer()
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Bill No:");
        billno=scanner.nextInt();
        System.out.println("Enter bill Date:");
        billdate=scanner.next();

        setPersonal("Customer");

        String option="";
        do {
             Product product=new Product();
             product.setProduct();
             totalamount=totalamount+product.price;
             products.add(product);

            System.out.println("Do you want to add another Product(Y/N)?:");
             option=scanner.next();


        }while(option.equalsIgnoreCase("y"));

        System.out.println("Enter Discount(%):");
        discount=scanner.nextFloat();
        discount=(discount*totalamount)/100;
        System.out.println("Enter Tax(%):");
        tax=scanner.nextFloat();
        tax=(tax*totalamount)/100;

        billamount=totalamount-discount+tax;


    }

    void getCustomer()
    {
        System.out.println("bill no:"+billno);
        System.out.println("bill date:"+billdate);

        getPersonal("Customer");

        System.out.println("ID\t Name\t Qty \t Rate \t Price");
        for(Product product:products)
        {
            product.getProduct();
        }
        System.out.println("total amount :"+totalamount);
        System.out.println("discount :"+discount);
        System.out.println("tax :"+tax);
        System.out.println("bill amount :"+billamount);

        System.out.println("------------------------------------");
    }




}
