import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}


#Sample Input :

madam


#Sample Output :

Yes
