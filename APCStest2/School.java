public class School
{
    private student [] students; 
    private Course [] catalog;

    public student getStudentById(int searchId)
    {
        /*for(int i =0; i <= students.length; i++){
            if(searchId == Student.getId[i]){
                return searchId;
            }
            else if (i == students.length && searchId != student.getId[i]){
                return null;
            }
        }*/
    }
    public double gpaForCourse( Course course){
        double gpa =0;
        double avggpa =0;
        double studenttake =0;
        double newgpa =0;
        for (int i =0; i <= students.length; i++){
            if (student.getCourse[i] == course){
                studenttake++;
                gpa = grade.getScore();
                newgpa +=gpa;
            }
            else if (student.getCourse[i] != course){
                newgpa +=0;
            }
            else if (i = student.length || student.getCourse[i] = course){
                avggpa = newgpa/ studenttake;
            }
            else {
                return -1;
            }
        }
    }
}
