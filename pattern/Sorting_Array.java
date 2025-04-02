public class Sorting_Array {
    public static void printsort(int arr[])
    {
        for (int turn=0;turn<arr.length;turn++)
        {

            for (int j=0;j<arr.length-1-turn;j++)
            {

                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void print(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
        printsort(arr);
        print(arr);


        //Creating 2d array

        int matrix[][]=new int[4][4];
        int n=matrix.length, m=matrix[0].length;

        int k =0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                matrix[i][j] = arr[k++];
            }
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
