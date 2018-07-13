import java.util.Scanner;
 
class Factorial
{
   public static void main(String args[])
   {
      int n, c, fact = 1;
 
      System.out.println("yo  factorial");
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if (n < 0)
         System.out.println("yo non-negative.");
      else
      {
         for (c = 1; c <= n; c++)
            fact = fact*c;
 
         System.out.println("yo fact of "+n+" is = "+fact);
      }
   }
}
