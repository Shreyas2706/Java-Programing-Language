import java.util.* ;
public class CalculatorSwtich {
public static void main (String args []) {
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Enter your two number");
float num1 = sc.nextFloat();
float num2 = sc.nextFloat();
System.out.println("Press the following button for performing the following operations");
System.out.println("1 :adition ");
System.out.println("2 : subtraction");
System.out.println("3: Multiplication");
System.out.println("4: Divisom");
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