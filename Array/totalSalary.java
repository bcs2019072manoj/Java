import java.util.Scanner;
import java.lang.Math;
public class totalSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sal= s.nextInt();
        String str=s.next();
       char ch = str.charAt(0);
       int allow;
       if(ch==65)
       {
           allow=1700;
       }
       else if(ch==66) {
           allow=1500;
       }
       else 
       {
           allow=1300;
       } 
     double total_sal=(sal+(.20*sal)+(.50*sal)+allow-(.11*sal));
     double p=Math.round(total_sal) ;
     int h=(int)(p); 
     System.out.println(h);
    }
}
