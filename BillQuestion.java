import java.util.* ;
public class BillQuestion {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in) ;
        float pencil = sc.nextFloat() ;
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat() ;
        float bill = pencil + pen + eraser ;
        System.out.println("TOTAL BILL :" + bill);
        float Netbill = (bill) + (18 * bill / 100)  ;
        System.out.println("NET BILL :" + Netbill);
    }
    
}
///// code run 
// done !!!!.........