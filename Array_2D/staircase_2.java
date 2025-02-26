package Array_2D;

public class staircase_2 {
    public static boolean stair(int matrix[][],int key)
    {
        int row= matrix.length-1;
        int col= 0;
        while (col < matrix.length && row >= 0)
        {
            if (matrix[row][col]==key)
            {
                System.out.println("Key found at ("+row+":"+col+")");
                return true;
            }
            else if (key>matrix[row][col])
            {
                col++;
            }
            else
            {
                row--;
            }
        }
        System.out.println("Key not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=48;
        stair(matrix,key);
    }
}
