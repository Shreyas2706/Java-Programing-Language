public class Function_Prime {
    public static boolean isprime(int a){
        boolean isprime = true ;
        for(int i = 2 ; i<=a-1 ; i++) {
            if(a%i==0){
                isprime = false ;

            }

        }
        if(isprime==false) {
            System.out.println("NO is Composite");
        }
        else{
            System.out.println("prime");
        }
        return isprime ;
    }
    public static void main(String[] args) {
        System.out.println(isprime(5));
    }
    
}
