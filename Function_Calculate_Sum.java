import java.util.Scanner ;
public class Function_Calculate_Sum {
public static void calculate() {
    Scanner sc = new Scanner(System.in) ;
    int a  = sc.nextInt() ;
    int b = sc.nextInt() ;
    int sum = a + b ;
    System.out.println("Print sum = " + sum);
}
public static void main(String[] args) {
    calculate();
}
}
