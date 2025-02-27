package Array_List;

import java.util.ArrayList;

public class PairSum
{
        public static boolean printsum(ArrayList<Integer> list, int target)
        {
            //Brute force
            for (int i=0;i< list.size();i++)
            {
                for (int j=i+1;j< list.size();j++)
                {
                    if (list.get(i)+list.get(j)==target)
                        return true;
                }
            }

            return false;
        }

    public static boolean printsum_2(ArrayList<Integer> list, int target)
    {
        //2 pointer approach
        int lp=0;
        int rp=list.size()-1;
        while (lp!=rp)
        {
            if (list.get(lp) + list.get(rp) == target)
                return true;
            if (list.get(lp) + list.get(rp) < target)
                lp++;
            else
                rp--;
        }
        return false;
    }

        public static void main(String[] args)
        {
            ArrayList<Integer> list=new ArrayList<>();

            list.add(1);
            list.add(8);
            list.add(6);
            list.add(2);
            list.add(5);
            list.add(4);
            list.add(8);
            list.add(3);
            list.add(7);

            System.out.println(printsum(list,8));
            System.out.println(printsum_2(list,8));
        }
}