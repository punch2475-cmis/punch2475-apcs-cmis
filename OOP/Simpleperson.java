 public class Simpleperson{
    private double age = 50;
    private boolean gender = true;
    int yearleft; 
    public Simpleperson(int age, boolean gender){

        if (gender)
        {
            double lifeexpectancy = 86.8;
            yearleft = lifeexpectancy - age;
        }
        else{
            double lifeexpectancy = 80.5;
            yearleft = lifeexpectancy - age;
        }
        return yearleft; 
    }
}
