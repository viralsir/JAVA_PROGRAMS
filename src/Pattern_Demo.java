public class Pattern_Demo {

    public static void main(String[] args) {

        int i=1;int k=1;
        while (i<=5)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(k+" ");
                j=j+1;
                k=k+1;
            }
            System.out.println("");
            i=i+1;
        }


    }
}
/*
   1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5

12345
1234
123
12
1

1
2 3
4 5 6
7 8 9 10



 */
