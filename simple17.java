package learnInit;

public class simple17 {
    public static void main(String args[])
       {
               int numerator, denominator;
               int remainder, quotient;
               numerator = Integer.parseInt(args[0]);
               denominator = Integer.parseInt(args[1]);
               quotient=numerator / denominator;
               remainder=numerator % denominator;
               System.out.println("quotient is :" + quotient + "remainder is :" + remainder);


       } 
}
