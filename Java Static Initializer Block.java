import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


static Scanner scan = new Scanner(System.in);
static int B = scan.nextInt();
static int H = scan.nextInt();
static boolean flag,a = B>0 && H>0;
static
{
    if(a)
        flag = true;
    else
        System.out.println("java.lang.Exception: Breadth and height must be positive");
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
#Sample Input1 :
  
1
3
  
#Sample Output1:
  
  3
#Sample Input2:
  
-1
2
  
#Sample Output2 :
  
  java.lang.Exception: Breadth and height must be positive

