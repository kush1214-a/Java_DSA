import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Principal : ");
        int P = scanner.nextInt();

        System.out.println("Enter Rate : ");
        int R = scanner.nextInt();

        System.out.println("Enter Time : ");
        int T = scanner.nextInt();

        int Si=P*R*T/100;
        System.out.println("Calculate Simple Interest : " + Si);
    }
}
