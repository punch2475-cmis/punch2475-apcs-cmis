public class Student{
    private String name;
    private int gradeLevel;
    private Grade[] grades;

    public String [] getCourseNameWithGradesBetterThan(double grade){
        
        for (int i =0; i< grades.length; i++){
            double nGrade = grades[i];
            if (grade >= nGrade){
                return grade[i];
            }
            else {
                return "";
            }

        
        }

    
    } 

}