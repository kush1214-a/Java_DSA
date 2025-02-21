package Array;

public class largest_number {
    public static int getlargest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++)
        {
            if (largest<numbers[i])
            {
                largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]={2,6,8,3,5,9,1,7,11};
        System.out.println("largest number is : "+ getlargest(numbers));
    }
}
