import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=1;
        while(sc.hasNext()){
            System.out.printf("%d %s\n",a,sc.nextLine());
            a=a+1;
        }
        sc.close();
    }
}

#Sample Input :

Hello world
I am a file
Read me until end-of-file.
  
#Sample Input :

1 Hello world
2 I am a file
3 Read me until end-of-file.
