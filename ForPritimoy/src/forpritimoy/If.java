
package forpritimoy;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    int num;
    System.out.print("Enter this number: ");
    num = input.nextInt();
    
    if(num>0){
        System.out.println("Posiive");
        }
    else if(num<0){
        System.out.println("Negetive");
    }
    else{
        System.out.println("Zero");
       }
 
    
    }
    
    
}
