import javax.swing.JOptionPane;
public class StudentInfo{
    private String name =  JOptionPane.showInputDialog( "Type your name: " );
    private int grade =  Integer.parseInt(JOptionPane.showInputDialog( "Type your grade: " ));
    public StudentInfo(String name, int grade){
        name = "Joy";
        grade = 12;
       
        
    }
}
