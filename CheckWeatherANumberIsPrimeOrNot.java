import java.util.* ;
public class CheckWeatherANumberIsPrimeOrNot {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter your number: ");
        int n =sc.nextInt() ;
        boolean isprime =true ;
        for (int i =2 ; i<=n-1 ; i++) {
            if(n%i==0) {
                isprime = false ;
            }
        }

            if (isprime = true) {
                System.out.println("Number is Prime");
            }       
            else{
                System.out.println("Number is composite");
            
          
        }
       
        
    }
}
