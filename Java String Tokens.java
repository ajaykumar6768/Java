import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st=new StringTokenizer(s, " !,?._'@");
        int count = st.countTokens();
        System.out.println(count);
            while (st.hasMoreTokens())
            {
                System.out.println(st.nextToken());
             }
    }
}


#Sample Input :

He is a very very good boy, isn't he?
  
#Sample Output :

10
He
is
a
very
very
good
boy
isn
t
he
