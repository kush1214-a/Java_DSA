package BackTracking;

public class GridWays {
    public static int printgrid(int i, int j, int n, int m)
    {
        if (i==n-1 && j==m-1)
        {
            return 1;
        }
        else if (i==n || j==m)
        {
            return 0;
        }

        int w1=printgrid(i+1,j,n,m);
        int w2=printgrid(i,j+1,n,m);
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n=2,m=2;
        System.out.println(printgrid(0,0,n,m));
    }
}
