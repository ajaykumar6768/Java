import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long l=sc.nextLong();
                if(l>=-128 && l<=127)
                { 
                    System.out.println(l+" can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                 else if( l <= 32767 && l >= -32768)
                {
                    System.out.println(l + " can be fitted in:"); 
                    System.out.println("* short \n* int \n* long");
                }
                else if ( l <= 2147483647 && l >= -2147483648)
                {
                    System.out.println(l + " can be fitted in:"); 
                    System.out.println("* int \n* long");
                }
                else
                {
                    System.out.println(l + " can be fitted in:"); 
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




#Sample Input :

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
  
  
#Sample Output :

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
