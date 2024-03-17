public class Function_Swap {
    public static void swap (int a , int b ) {
        System.out.println("a = "+a);
        System.out.println("b = " +b);

    }
    public static void main(String[] args) {
        int a = 10 ;
        int b = 200 ;
        int temp = a ;
        a = b ;
        b = temp ;
        swap(a, b) ;
    }
    
}
