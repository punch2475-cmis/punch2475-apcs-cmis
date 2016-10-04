import javax.swing.JOptionPane;
public class StudentGrade{
    private String subject1 = JOptionPane.showInputDialog( "Type your subject: " );
    private String subject2 = JOptionPane.showInputDialog( "Type your subject: " );
    private String subject3 = JOptionPane.showInputDialog( "Type your subject: " );
    private String subject4 = JOptionPane.showInputDialog( "Type your subject: " );
    private String subject5 = JOptionPane.showInputDialog( "Type your subject: " );
    public String[] subject = {subject1, subject2, subject3, subject4, subject5};


    public StudentGrade(String subject1, String subject2, String subject3, String subject4, String subject5){

    }
    
    public String getSubject1(){
        return subject1;
    }//end getter 
    
    public void setSubject1(String newSubject1)
    {
        
    }//end setter 
    
   
}
