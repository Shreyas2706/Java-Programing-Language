import java.util.* ;
public class LeapYearqQuestion {
   public static void main (String args []) {
   Scanner sc = new Scanner(System.in) ;
   System.out.println("Enter Year");
   int year = sc.nextInt() ;
   if (year%4==0 && (year%100==0 || year%400==0)) {
    System.out.println("Leap Year");
   } else {
    System.err.println("Not a leap year");
   }
   } 
}
