import java.util.* ;
public class PrintStartPattern {
    public static void main (String args []) {
Scanner sc = new Scanner (System.in) ;
System.out.print("Enter your number :");
int n = sc.nextInt() ;
boolean number = true ;
for (int i = 2 ; i<=n-1 ; i++) {
    if (n%i==0) {
        number = false ; 
    }
    } if (number==false) {
        System.out.println("The entered number is composite");
    } else {
        System.out.println("The given number is prime");
    }
}
}