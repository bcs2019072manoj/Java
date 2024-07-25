package Array;
import java.util.Scanner;
public class arrInput {
    public static void main(String[] args) {
        int arr[]=new int[];
        Scanner s= new Scanner(System.in);    //System.in is a standard input stream  
        for(int i=0;i<10;i++){
            System.out.print("Enter the numbers in the array- ");
            arr[]=s.nextInt(); 
        }
    }
    
}
