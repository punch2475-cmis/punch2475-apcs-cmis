import javax.swing.JOptionPane;
public class SISApp
{
    public static void main(String [] arg){
        int output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
        while( output > 0 )
        {
            if( output == 1 )
            {
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 2 )
            {
                School s2 = new School();
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 3 )
            {
                StudentInfo s1 = new StudentInfo();
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 4 )
            {
                Course c1 = new Course();
                output = (Integer.parseInt(JOptionPane.showInputDialog( "1: View Student List" + "\n2: View Course List" + "\n3: Add a Student" + "\n4: Add a Course" + "\n0: Quit")));
            }
            else if( output == 0 )
            {
                return;
            }//end if
        }//end while
    }//end main
}//end class
