package packagedemo;

public class FourthOption //extends FirstOption
{
    public static void main(String[] args)
    {
        //FourthOption fr=new FourthOption();
        FirstOption fr=new FirstOption();

        //System.out.println("Private int pr :"+fr.pr);
        System.out.println("Protected int pro:"+fr.pro);
        System.out.println("default int def:"+fr.def);
        System.out.println("public int pu :"+fr.pu);

    }
}
