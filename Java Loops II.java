import java.util.Scanner;
import java.lang.Math;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int j,i;
        for(i=0;i<t;i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int s=a;
            for(j=0;j<n;j++)
            {
                s=s+b*(int)Math.pow(2,j);
                int k=s;
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

#Sample Input :

2
0 2 10
5 3 5
  
#Sample Output :

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
