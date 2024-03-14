import java.util.* ;
public class Alphabet_Case_Check {
    public static void main(String[] args) {
        // String name = "Hello" ;
        // char ch = name.charAt(2) ;
        // System.out.println(ch);

        Scanner sc = new Scanner(System.in) ;
        char ch = sc.next().trim().charAt(0) ;

        if (ch>='A' && ch<='Z') {
            System.out.println("1");

        }  

        else if (ch>='a'&& ch<='z') {
            System.out.println("0");

        }
        else {
            System.out.println("-1");
        }


    }
    
}
