import javax.swing.JOptionPane;

public class StudentInfo
{

    private String name;
    private int grade;

    public StudentInfo()
    {
        this.name = JOptionPane.showInputDialog( "Type your name: " );
        this.grade = Integer.parseInt(JOptionPane.showInputDialog( "Type your grade: " ));
        //both info entered manually
    }//end constructor

    public String toString()
    {
        String output = "Student Name: " + name + "\nGrade: " + grade;
        return output;
    }

}