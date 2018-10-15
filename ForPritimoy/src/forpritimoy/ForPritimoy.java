
package forpritimoy;

import java.util.Scanner;

public class ForPritimoy {

    public static void main(String[] args) {
        System.out.println("Suprovat Roy\nGraphics Designer\nPushamla, Samdhinagar, Baliakandi, Rajbari");
        
       System.out.println("My Simple Mathmatic is here:");
       
       Scanner input = new Scanner(System.in);
       int num1, num2, result;
       System.out.print("Type your first Number: ");
       num1 = input.nextInt();
       System.out.print("Type your Second Number: ");
       num2 = input.nextInt();
       
      result = num1 + num2;
      System.out.print("Total Number="+result);
       
    }
    
}
