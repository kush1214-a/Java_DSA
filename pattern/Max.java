import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = scanner.nextInt();

        if (a>b) {
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);

        }
        else{
                if (b>c)
                    System.out.println(b);
                else
                    System.out.println(c);

        }
    }
}
