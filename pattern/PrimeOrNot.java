import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();

        boolean isPrime=true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%2==0)
                isPrime=false;
        }
        if (isPrime==true)
            System.out.println("n is prime no");
        else
            System.out.println("n is not a prime no");
    }
}