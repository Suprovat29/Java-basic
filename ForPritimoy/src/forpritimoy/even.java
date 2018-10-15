
package forpritimoy;

import java.util.Scanner;

public class even {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
    int num;
    System.out.print("Enter the Number:");
    
    num= input.nextInt();
    if(num%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }    
        
    }
 
    
}
