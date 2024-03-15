import java.util.* ;
public class Calculator_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        char op = sc.next().trim().charAt(0) ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0 ;
        if (op=='+' || op == '-' || op=='+' || op=='/') {
            if (op == '+')
           num = a + b ;
        }
         if (op == '-') {
         num = a - b ;
        }
        if (op=='*') {
            num = a*b; 
    }
        if(op =='/'){
            num = a/b;
        }
    System.out.println(num);
}
}
