import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n=s.nextInt();
        if(n==0)System.out.println("You've entered zero");
        else if (n<0) System.out.println("Negative Number");
        else System.out.println("Positive number");
        s.close();
    }
    
}
