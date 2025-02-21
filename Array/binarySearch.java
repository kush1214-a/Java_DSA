package Array;

import java.util.*;

public class binarySearch {
    public static int search(int numbers[], int key)
    {
        int start=0;
        int end=numbers.length-1;

        while (start<=end)
        {
            int mid=(start+end)/2;
            if(numbers[mid]==key)
                return mid;
            if (numbers[mid]<key)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key to be search ");
        int key= sc.nextInt();
        System.out.println("Index of key is : "+ search(numbers,key));
    }
}
