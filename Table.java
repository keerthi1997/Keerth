import java.util.Scanner;
 
class Table
{
   public static void main(String args[])
   {
      int n, c,m;
      System.out.println("Enter an integer to print it's multiplication table");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      m=in.nextInt();
      System.out.println("Multiplication table of "+n+" is :-");
 
      for ( c = 1 ; c <= m; c++ )
         System.out.println(n+"*"+c+" = "+(n*c));
   }
}
