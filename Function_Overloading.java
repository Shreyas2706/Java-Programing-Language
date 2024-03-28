public class Function_Overloading {
    
    // function to calculate sum of 2 number
    public static int sum (int a , int b) {
        return a+b ;
    }

    // fucntion to calculate sum of 3 number
    public static int sum(int a , int b , int c) {
        return a + b + c ;
    }
    public static void main (String args [] ){
        System.out.println(sum(5, 3));
        System.out.println(sum(5, 2, 1));
    }
    
}
