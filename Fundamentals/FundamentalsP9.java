import javax.swing.JOptionPane;
public class FundamentalsP9
{ public static void main (String [] arg)
    {
        String username = new String("punch2475");
        int password = 070;
        String input1 = JOptionPane.showInputDialog( " Type username: ");
        String input2 = JOptionPane.showInputDialog( " Type password: ");
        
        if (input1.equals("punch2475") && input2.equals(070))
         {
             System.out.println ("You have sucessfully logged in.");
            }
        else
        {
            System.out.println(" Login unsucessful...try again");
        }
        
    }
}