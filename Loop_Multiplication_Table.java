import java.util.*;
public class Loop_Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int multi= 1 ;
        for(int i = 1 ; i<=10 ; i++) {
        multi = a*i ;
        System.out.println(multi);
        }
        System.out.println( );
    }
}
