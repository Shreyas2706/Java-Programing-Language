import java.util.* ;
public class Temperature_Conversion {
    public static void main(String[] args) {
        
        System.out.print("Please enter your temp in C : ");
        Scanner Input = new Scanner(System.in);
        Float C= Input.nextFloat() ;
        float F = (C *9/5) + 32 ;
        System.out.println("Temperature in farenhite is " +F);

    }
    
}
