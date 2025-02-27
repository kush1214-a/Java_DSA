package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class first {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        ArrayList<Float> list4=new ArrayList<>();

//        add operation -O(1)
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(2,9);  //O(n)
        System.out.println(list);

//        get operation  -O(1)
//        int element= list.get(2);
//        element= list.getFirst();
//        element= list.getLast();
//        System.out.println(element);
//
//        remove operation  -O(n)
//        list.remove(1);
//        System.out.println(list);
//
//        set element at index   -O(n)
//        list.set(2,10);
//        list.set(0,7);
//        System.out.println(list);
//
//
//        contain   -O(n)
//       System.out.println(list.contains(2));
//        System.out.println(list.contains(7));

//        size method    -O(n)
//        System.out.println(list.size());
//        for (int i=0;i<list.size();i++)
//        {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.print("   forward");
//        System.out.println();
//
////        reverse
//        for (int i=list.size()-1;i>=0;i--)
//        {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.print("   Reverse");
//        System.out.println();


//        maximum and minimum
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<list.size();i++)
//            max=Math.max(max,list.get(i));
//        System.out.println("Maximum Element : "+max);
//
//        int min=Integer.MAX_VALUE;
//        for (int i=0;i<list.size();i++)
//            min=Math.min(min,list.get(i));
//        System.out.println("Minimum Element : "+min);


        //swap
        int idx1=1, idx2=3;
        swap(list,idx1,idx2);
//        System.out.println(list);

        //sort
        Collections.sort(list);
        System.out.println(list+"   ascending");  //ascending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list+"   descending");   //descending

        

    }

}
