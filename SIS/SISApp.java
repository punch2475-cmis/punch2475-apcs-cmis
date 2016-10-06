import javax.swing.JOptionPane;
public class SISApp
{
    public static void main(String [] arg){
        int output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
        if( output == 1 )
        {
            StudentInfo s1 = new StudentInfo();
        }
        else if( output == 2 )
        {

        }

    }
}
