import javax.swing.JOptionPane;
public class FundamentalsP2
    {
     public static void main ( String args[] )
     {
       String input1 = JOptionPane.showInputDialog( "Type a number: " );
       
       String input2 = JOptionPane.showInputDialog( "Type a number again!: " );
       
       int a = Integer.parseInt(input1);
       int b = Integer.parseInt(input2);
       
       if (a > b) 
        {
            System.out.println( " The value of a is" + a + "and it greater than b whose value is " + b + ".");
        }
        else if (a < b )
        {
            System.out.println( "The value of a is" + a + " and it less than b whose value is "+b+ ".");
        }
        else 
        {System.out.println( " The value of a is" + a + " and it is equal to b whose value is" + b + ".");
        }// end method main
    }
        
    }// end  class __