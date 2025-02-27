package BackTracking;

public class Subsets {
    public static void printsubset(String str, String ans, int i)
    {
        //Base Case
        if (i==str.length())
        {
            if (ans.length()==0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }

        //Recursion

        //yes choice
        printsubset(str,ans+str.charAt(i),i+1);

        //no choice
        printsubset(str,ans,i+1);
    }

    public static void main(String[] args) {
        String str="kush";
        printsubset(str,"",0);
    }
}
