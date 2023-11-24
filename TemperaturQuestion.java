import java.util.* ;
public class TemperaturQuestion {
   public static void main (String args []) {
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Enter your Temperature");   
    float temp = sc.nextFloat();
    if (temp>=100) {
        System.out.println("You have fever");
    } else {
        System.out.println("You dont have fever");
    }

   } 
}
//// question done !!!!.......