import java.util.*;
public class Purchase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int amt=s.nextInt();
        if(amt<500)System.out.println("Pay the full amount without the taxes");
        else if(amt>500||amt<1000){
            amt=amt+amt/10;
            System.out.println("Discount applied");
            System.out.println("You've to pay  "+amt);
        }
        else if(amt>1000){
            amt=amt+amt/20;
            System.out.println("You've to pay "+amt);
        }
    }
    
}
