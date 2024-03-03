import java.util.Scanner ;
public class ContinueQuestion {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in) ;
       
        do { 
            System.out.print("Enter your number : ");
            int n = sc.nextInt() ;
            if (n%10==0) {
                System.out.println("User entered multiple of 10");
                continue ;
            }
            System.out.println("You Enter number : " +n);


        } while (true) ;
            
        
        }
    }
    

