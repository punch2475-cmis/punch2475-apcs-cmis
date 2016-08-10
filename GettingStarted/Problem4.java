import java.util.Scanner;
import javax.swing.JOptionPane;
public class Problem4
    {
     public static void main ( String args[] )
     {
       
       String input1 = JOptionPane.showInputDialog( "Pick first number: " );
       String input2 = JOptionPane.showInputDialog( "Pick second number: " );
 
       int num1 = Integer.parseInt(input1);
       int num2 = Integer.parseInt(input2);
       
       int sum1 = num1 + num2;
       int sum2 = num2 + num1;
       int subtract1 = num1 - num2;
       int subtract2 = num2 - num1;
       int multiply1 = num1 * num2;
       int multiply2 = num2 * num1;
       int divide1 = num1/num2;
       int divide2 = num2/num1;
       int modulo1 = num1%num2;
       int modulo2 = num2%num1;
       


        }// end method main
       
        
    }// end  class __
       