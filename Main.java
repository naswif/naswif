import java.util.Scanner;
public class Main
{
public static void main( String args[] )
{
  Scanner input = new Scanner( System.in );
  int num1;
  int num2;
  int num3;
  int sum;
  int product;
  int average;
System.out.println( "Enter first integer:" );
  num1 = input.nextInt();
System.out.println( "Enter second integer:" );
  num2 = input.nextInt();
System.out.println( "Enter second integer:" );
  num3 = input.nextInt();
  sum = num1 + num2 + num3;
  product = num1 * num2 * num3;
  average = ( num1 + num2 + num3 ) / 3;
 System.out.printf( "The sum is %d\nThe product is %d\nThe average is %d\n",
  sum, product, average );
}
} // end class Arithmetic

Upload your work
