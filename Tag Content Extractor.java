import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Solution assumes we can't have the symbol "<" as text between tags */
public class Solution {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            String line = scan.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
    }
}



#Sample Input :

4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crash</SA premium>


#Sample Output :

Nayeem loves counseling
Sanjay has no watch
None
Imtiaz has a secret crash
