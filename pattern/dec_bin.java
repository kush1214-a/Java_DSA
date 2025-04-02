
import java.util.*;

public class dec_bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int binNUm=sc.nextInt();
        int myNum=binNUm;
        int pow=0;
        int decNum=0;
        while (binNUm>0)
        {
            int lastDigit=binNUm%2;
            decNum=decNum+(lastDigit*(int)Math.pow(10,pow));

            pow++;
            binNUm=binNUm/2;
        }
        System.out.println("Decimal of "+myNum+" is : "+decNum);
    }
}
