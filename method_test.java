// this program display the sum and the multiplcatin and the divesion.

import java.util.Scanner;

public class method_test
{


  // this is a method to get the input.

public static double input_m()
{
Scanner KB= new Scanner(System.in);
double value;
System.out.println("enter a number");
value = KB.nextDouble();
//if(value < 0);
//value = input_Val();
return value;
 
}
// this is a method to get the sum.

public static double add_m (double num1 , double num2 )
{
double sum = 0;
sum = num1 + num2 ;
return sum ;
}
// this is a method to display the output.

public static void output_m (double n1, double n2, double answer)
{
System.out.printf("the first number is %f  the 2nd number is %f the answer is %f  \n  ", n1 ,n2, answer);
}
// this is the input validation method.

public static double input_val()
{
Scanner KB = new Scanner(System.in ) ;

double value; 
System.out.println("enter positve number");

value = KB.nextDouble();
return value; 
}

// this method gets the multiplation value. 

public static double multi_m (double n1 , double n2 )
{
  double multi = 0 ; 

  multi =  n1 * n2 ; 

  return multi ; 
}

// this method culculate the devesion value of the two numbers. 

public static double dev_m (double n1 , double n2 )
{
  double dev = 0; 

  dev = n1 / n2 ; 

  return dev ; 
}

// this method clclate the substact value. 

public static double sub_m (double n1, double n2 )
{
  double sub = 0 ;

  sub = n1 - n2 ; 

  return sub; 
}
public static void main(String []args)
{
double num1 , num2 , answer;
int select, repeat ;
Scanner KB= new Scanner(System.in);



  do
 {
 num1 = input_m();
 num2 = input_m();

 // ask the user to selsect one opration to do. 


 System .out. println ("enter a number to select ");

 select = KB.nextInt();
 
    switch (select )
    { 

      // to get the sum of the two numbers. 
     case 1:
     answer= add_m(num1, num2 );
     output_m (num1, num2, answer);
     break ;

     // to get the multiplication of the two numbers. 

     case 2 : 

     answer = multi_m(num1 , num2 );
     output_m (num1, num2, answer);
     break ;


     // to get the division of the first number on the seconed number. 

     case 3 : 


     answer = dev_m (num1 , num2 );
     output_m (num1, num2, answer);
     break ;

     // to get the Subtraction of the first number on the seconed. 

     case 4 : 

     answer = sub_m ( num1 , num2 );
     output_m (num1, num2, answer);
     break ;

     default:
     System.out.println ("worng input please try again ");
     select = KB.nextInt();
   
    }
  System.out.println("enter 10 if you want to continue");
  repeat= KB.nextInt();
 }while (repeat == 10 );
}

}