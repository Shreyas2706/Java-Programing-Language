import java.util.* ;
 public class Just_For_Fun {
    public static void main (String args []) {
Scanner sc = new Scanner (System.in) ;
int a = sc.nextInt() ;
boolean isprime = true ;
for (int i = 2 ; i<=a-1 ; i++) {
    if (a%i==0) {
        isprime = false ;
    }
}
if (isprime = true) {
    System.out.println("not prime");

}
else{
    System.out.println("Prime");
}
    


}

 }

 

