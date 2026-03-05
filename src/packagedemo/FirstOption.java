package packagedemo;

public class FirstOption
{
    private int pr=32;
    protected int pro=34;
    int def=34;
    public int pu=34;

    public static void main(String[] args)
    {
        FirstOption fr=new FirstOption();

        System.out.println("Private int pr :"+fr.pr);
        System.out.println("Protected int pro:"+fr.pro);
        System.out.println("default int def:"+fr.def);
        System.out.println("public int pu :"+fr.pu);

    }

}

class Secondoption  // extends FirstOption
{
    public static void main(String[] args)
    {
        //Secondoption fr=new Secondoption();
        FirstOption fr=new FirstOption();

      //  System.out.println("Private int pr :"+fr.pr);
        System.out.println("Protected int pro:"+fr.pro);
        System.out.println("default int def:"+fr.def);
        System.out.println("public int pu :"+fr.pu);

    }

}
