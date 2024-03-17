import java.util.*;
public class Loops_Fctorial {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in) ;
      int a = sc.nextInt() ;
      int fact = 1 ;
      for (int i = 1 ; i<=a ; i++) {
        fact = i*fact ;
      }
System.out.println("factorial = " + fact);
    }
}