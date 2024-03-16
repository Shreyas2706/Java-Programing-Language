import java.util.* ;
public class Switch_Weekday {
    public static void main(String[] args) {
    System.out.println("Enter weekday number");
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt() ;
    switch (num) {
        case 1-> System.out.println("Monday");
        case 2-> System.out.println("Tuesday");
        case 3->System.out.println("Wednesday");
        case 4->System.out.println("thursday") ;
        case 5->System.out.println("Friday");
        case 6->System.out.println("saturday");
        case 7->System.out.println("Sunday");
        default -> System.out.println("Enter a valid weekday");
    } 

    }
    
}
