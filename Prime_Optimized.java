public class Prime_Optimized {
    public static boolean isprime(int a ) {
        boolean isprime = true ;
        for(int i = 2 ; i<=Math.sqrt(a); a++){
            if(a%i==0) {
                return  false ;
            }


        }
        return true ;
    }
    public static void main(String[] args) {
        System.out.println(isprime(12));
    }
}
