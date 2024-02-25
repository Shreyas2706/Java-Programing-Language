import java.util.* ;
public class SumOfNNaturalNumber {
   public static void main (String args []) {
    Scanner sc = new Scanner (System.in) ;
    int n = sc.nextInt() ; // RANGE
    int i = 1 ; // COUNTER 
    int sum = 0 ; // SUM VARIABLE 
    while (i<=n) {
        sum = sum + i ; // ANOTHER WAY OF WRITING (SUM + =  i )
        i ++ ; // increment value of counter
    }
    System.out.println("SUM IS : " + sum);
   } 
}
