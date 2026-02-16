package oop;
// static member variable has a single copy for every object.
public class StaticDemo
{
    // member variable
    static  int no;
    int no2;

     void setNo()
    {
        System.out.println(no);

    }


    public static void main(String[] args)
    {
        StaticDemo s1=new StaticDemo();
        s1.no=34;
        StaticDemo s2=new StaticDemo();
        s2.no=45;

        no=123;
        s1.setNo();

        System.out.println("s1 no:"+s1.no);
        System.out.println("s2 no:"+s2.no);
        System.out.println("class name:"+StaticDemo.no);
        System.out.println("static function :"+no);


    }
}
