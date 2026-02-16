/*
  Data type : type of data which is being store/saved.

  Category of Data type in Java

  1) Primary or inbuilt Data type
  2) Derived Data type
  3) Abstract Data type

  1 byte =   8 bits

                    Primary Data type  or inbuilt data type

 keyword                    use                     byte                      range
 boolean                    true/false               jvm                       jvm
 byte                       numeric value            1                        -128 to 127
 char                       character,symbol         1
 int                        numeric value            2
 long                       numeric value            4
 float                      floating value           8
 double                     decimal value                         16

 String                     characters



 12 -> "12" ->
phone number -> 9812312345

variable : name of the memmory location where data is being stored.

byte no
Assignment operator -> =  -> copy the value of right into left
no=13


 */
public class DataTypeDemo
{

    public static void main(String[] args) {

        // declartion of variable
        // initialization of variable
        //boolean bl=true;
        //boolean bl;

        // asign false to the bl variable
        //bl=flase

        boolean bl=true;
        byte y;
        char c='s';
        String name="vimal";
        int no=2;
        long lno=3434343;
        float fl=34.44f;
        double dl=45454545.454;

        y=23;
       // no=y;    // implicite type conversion
        y= (byte) no;  // explicite type conversion

        System.out.println("bl" +    bl );
        System.out.println(" byte y:"+y);
        System.out.println("char c:"+c);
        System.out.println("String name :"+name);
        System.out.println("int no:"+no);
        System.out.println("long lno :"+lno);
        System.out.println("Float fl:"+fl);
        System.out.println("double dl:"+dl);






    }
}
