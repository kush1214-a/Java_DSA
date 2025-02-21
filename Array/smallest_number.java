package Array;

public class smallest_number {
    public static int getsmallest(int numbers[])
    {
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++)
        {
            if (smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[]={2,6,8,3,5,9,7,11};
        System.out.println("largest number is : "+ getsmallest(numbers));
    }
}
