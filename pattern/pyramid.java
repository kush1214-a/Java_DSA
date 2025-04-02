public class pyramid {

    public static void hollow()
    {
            int totRow=7;
            int totCol=15;

            for(int i=1;i<=totRow;i++)
            {
                for(int j=1;j<=totCol;j++)
                {
                    if(i==1 || i==totRow || j==1 || j==totCol)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
    }

    public static void inverted(int n)
    {
        for(int i=1;i<n;i++)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void halfPyramid_number(int n)
    {

        for(int line=1; line<=n;line++)
        {
            for (int num=1;num<=n-line+1;num++)
            {
                System.out.print(num+" ");

            }
            System.out.println();
        }

    }
    public static void floyd_Triangle(int n)
    {
        int a=1;
        for(int line=1; line<=n;line++)
        {
            for (int num=1;num<=line;num++)
            {
                System.out.print(a+" ");
                a++;

            }
            System.out.println();
        }

    }


    public static void zer0_one(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if ((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }

    }

    public static void butterfly(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            //space
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            //star
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();

        }


        //2nd half
        for(int i=n;i>=1;i--)
        {
            //star
            for (int j=1;j<=i;j++)
                System.out.print("*");
            //space
            for (int j=1;j<=2*(n-i);j++)
                System.out.print(" ");
            //star
            for(int j=1;j<=i;j++)
                System.out.print("*");

            System.out.println();
        }

    }

    public static void Rhombus(int n)
    {
        for (int i=1;i<=n;i++)
        {
            //space
            for (int j=1;j<=n-i;j++)
                System.out.print(" "+" ");
            //star
            for (int j=1;j<=n;j++)
                System.out.print("*"+" ");

            System.out.println();
        }

    }

    public static void hollow_Rhombus(int n)
    {
        for (int i=1;i<=n;i++)
        {
            //space
            for (int j=1;j<=n-i;j++)
                System.out.print(" ");
            //star
            for (int j=1;j<=n;j++)
            {
                if (i==1 || i==n || j==1 || j==n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
//        System.out.println("Inverted half pyramid");
//        inverted(9);
//        System.out.println("Hollow Rectangle");
//        hollow();
//        halfPyramid_number(6);
//        floyd_Triangle(7);
//        zer0_one(6);
//        butterfly(6);
//        Rhombus(5);
        hollow_Rhombus(6);
    }
}
