import javax.swing.JOptionPane;
public class FundamentalsP9
{ public static void main (String [] arg)
    {
        String user = JOptionPane.showInputDialog( " Type username: ");
        String num = JOptionPane.showInputDialog( " Type password: ");
        int passint = Integer.parseInt(num);
        if (user.equals("punch2475") && passint == (123456))
         {
             System.out.println ("You have sucessfully logged in.");
            }
        else
        {
            System.out.println(" Login unsucessful...try again");
        }
        
    }
}