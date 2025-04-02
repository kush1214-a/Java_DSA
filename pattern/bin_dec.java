package pattern;

import java.util.*;

public class bin_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number : ");
        int binNUm=sc.nextInt();
        int myNum=binNUm;
        int pow=0;
        int decNum=0;
        while (binNUm>0)
        {
            int lastDigit=binNUm%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));

            pow++;
            binNUm=binNUm/10;
        }
        System.out.println("Decimal of "+myNum+" is : "+decNum);
    }
}
