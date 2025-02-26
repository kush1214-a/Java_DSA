package Array_2D;
import java.util.*;
public class Creating {

    //search key

    public static boolean search(int matrix[][],int key)
    {
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]==key)
                {
                    System.out.println("Key found at position ("+i+":"+j+")");
                    return true;

                }
            }

        }
        return false;
    }

    //****************************************************************
    //search smallest number

    public static int smallest(int matrix[][])
    {
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]<smallest)
                {
                    smallest=matrix[i][j];

                }
            }

        }
        return smallest;
    }

    //****************************************************************
    //search largest number

    public static int largest(int matrix[][])
    {
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]>largest)
                {
                    largest=matrix[i][j];

                }
            }

        }
        return largest;
    }


    //main function

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                 matrix[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,7);
        System.out.println( "largest = "+  largest(matrix));
        System.out.println( "Smallest = "+  smallest(matrix));
    }
}
