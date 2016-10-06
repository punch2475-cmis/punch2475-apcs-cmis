import javax.swing.JOptionPane;
public class Course
{
    private String courseName;
    
    public Course()
    {
        this.courseName = JOptionPane.showInputDialog( "Type your course: " );
        
    }//end constructor
    
    /*
    public String toString()
    {
        String output = "Student Name: " + name + "\nGrade: " + grade;
        return output;
    }
    */
    
}
