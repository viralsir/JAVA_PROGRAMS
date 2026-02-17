package oop;

public class FunctionOverLoadingDemo
{
    static int  total(int no1,int no2)
    {
        return no1+no2;
    }
    static int total(int no1,int no2,int no3)
    {
        return no1+no2+no3;
    }
//    static void total(int no1,int no2)
//    {
//        System.out.println(no1+no2);
//    }

    public static void main(String[] args)
    {

        System.out.println(total(12,23));
        System.out.println(total(23,23,22));
    }

}
