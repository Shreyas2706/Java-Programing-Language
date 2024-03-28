public class Binomial_Cofficient {
public static int factorial(int num1) {
    int f = 1 ;
    for(int i = 1 ; i<=num1 ; i++) {
    f = f * i ;
    }
    return f ;
}

public static int binocoffic(int a , int b) {
    int n = factorial(a) ;
    int r = factorial(b);
    int diff = factorial(a - b) ;
    int bino = n / (r* diff) ;
    return bino ;
}

public static void main (String args []) {
    System.out.println(binocoffic(5, 2));
}

    
    
        

    
}
