import java.util.* ;
public class CalculatorSwtich {
public static void main (String args []) {
    Scanner sc = new Scanner (System.in) ;
float num1 = sc.nextFloat();
float num2 = sc.nextFloat();
int operator = sc.nextInt();
switch(operator){
    case 1 : System.out.println(num1 + num2 );
    break ;
    case 2 : System.out.println(num1 - num2);
    break;
    case 3 : System.out.println(num1 * num2);
    break ;
    case 4 : System.out.println(num1 / num2);
    break ;
    default : System.out.println("Wrong Button Pressed");
} 
}
}