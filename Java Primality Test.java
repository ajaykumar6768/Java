import java.math.BigInteger;  
import java.util.*;
public class BigIntegerIsProbablePrimeExample1
{  
  public static void main(String[] args)
  {  
      BigInteger big1;  
      Boolean bool1; 
      Scanner g =new Scanner(System.in);
      big1= g.nextBigInteger();   
      bool1= big1.isProbablePrime (1);    
      if(bool1)
          System.out.println("prime");
      else
          System.out.println("not prime");
   
  
  }  
} 

#Sample Input :

13
  
#Sample Output :

prime
