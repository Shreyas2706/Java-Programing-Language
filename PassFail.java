import java.util.* ;
public class PassFail {
public static void main (String args []) {
    Scanner sc = new Scanner (System.in) ;
    System.out.println("Enter student number");
    int marks = sc.nextInt();

    String type = (marks>=33)? "Student is pass" : "Student is fail" ;

    System.out.println(type);
}
}
