import javax.swing.JOptionPane;

public class StudentInfoTester
{
    
    private String name;
    private int grade;
    
    public StudentInfoTester( String nameInput, int gradeInput )
    {
        this.name = JOptionPane.showInputDialog( "Type your name: " );
        this.grade = Integer.parseInt(JOptionPane.showInputDialog( "Type your grade: " ));
        //both info entered manually
    }//end constructor
    
    /*
    public int getGrade()
    {
        return grade;
    }//end getter method 

    public void setGrade(int newGrade)
    {
        grade = (int)(Math.random()*11)+1;
        grade = newGrade;
    }//end setter method 
    
        public StudentInfoTester( String name )
    {
        this.name = JOptionPane.showInputDialog( "Type your name: " );
        this.grade = grade;
        //name is entered manually
        //Grade is randomnized
    }
    */
    
    public String toString()
    {
        String output = "Student Name: " + name + "\nGrade: " + grade;
        return output;
    }

}