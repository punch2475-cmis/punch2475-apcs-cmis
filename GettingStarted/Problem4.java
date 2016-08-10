import java.util.Scanner;
import javax.swing.JOptionPane;
public class Problem4
    {
     public static void main ( String args[] )
     {
       
       String input1 = JOptionPane.showInputDialog( "Pick first number: " );
       String input2 = JOptionPane.showInputDialog( "Pick second number: " );
 
       float num1 = Integer.parseInt(input1);
       float num2 = Integer.parseInt(input2);
       
       float sum1 = num1 + num2;
       float subtract1 = num1 - num2;
       float subtract2 = num2 - num1;
       float multiply1 = num1 * num2;
       float divide1 = num1/num2;
       float divide2 = num2/num1;
       float mol1 = num1%num2;
       float mol2 = num2%num1;
       
       System.out.println( num1 + "+" + num2 + "=" + sum1);
       System.out.println( num2 + "+" + num1 + "=" + sum1);
       System.out.println( num1 + "-" + num2 + "=" + subtract1);
       System.out.println( num2 + "-" + num1 + "=" + subtract2);
       System.out.println( num1 + "*" + num2 + "=" + multiply1); 
       System.out.println( num2 + "*" + num1 + "=" + multiply1); 
       System.out.println( num1 + "/" + num2 + "=" + divide1); 
       System.out.println( num2 + "/" + num1 + "=" + divide2);
       System.out.println( num1 + "%" + num2 + "=" + mol1);
       System.out.println( num2 + "%" + num1 + "=" + mol2);


        }// end method main
       
        
    }// end  class __
       