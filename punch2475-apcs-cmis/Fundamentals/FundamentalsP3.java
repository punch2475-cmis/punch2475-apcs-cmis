import javax.swing.JOptionPane;
public class FundamentalsP3{
    public static void main (String arg [] )
    {
        String input=  JOptionPane.showInputDialog ("Type a number: ");
        
        int a = Integer.parseInt(input);
            
        if (a % 2 ==1)
        {
            System.out.println( a + " is odd number");
        }
        else  
        {
            System.out.println( a + " is even number");
        }
    }// end main
}// end class