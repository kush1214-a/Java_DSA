package Bit_Manipulation;

import java.util.Scanner;

public class even_odd {
    public static void printevenorodd(int num)
    {
        int bitmask=1;
        if ((num & bitmask)==0)
            System.out.println("even number");
        else
            System.out.println("odd number");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number ");
        int num=sc.nextInt();
        printevenorodd(num);
    }
}
