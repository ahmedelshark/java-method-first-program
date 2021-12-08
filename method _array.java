// this program proform functions using methods and arrays

import java.util.Scanner;

public class method_array
{
   public static void main (String[]args)
   {
       // declare my varibles.
   
       final int size = 20 ;
       double [] nums = new double [size} ;
 
   }
   
   public static void input_m (double AR[], int size)
   {
   // declare my scanner
   Scanner KB = new Scanner(System.in);
   
      for (int i = 0 ; i < size ; i ++)
      {
       System.out.println("enter a number");
       AR[i] = KB.nextDouble();
       if (AR[i] < -100 || AR[i] > 100 )
       AR[i] = input_val(AR[i])
     
      }
    }

public static double input_val (double x )
{
   // declare a scanner.
   Scanner KB = new Scanner(System.in);
   
   while (x < -100|| x > 100 )
   {
   System.out.println ("worng input, please enter a new number \n") ;
   x = KB.nextDouble();
   }
   
   return x ;    

}

public static double sum_p (double ar[], int ss)
{
   double accu = 0 ;
   
   for (int i = 0 ; i < ss ; i++ )
   {
   if ( ar[i] < 0 ){
      accu = accu + ar[i] ; 
   }

   
}

}
