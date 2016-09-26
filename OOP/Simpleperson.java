 public class Simpleperson{
    private double age = 50.0;
    private boolean gender = true;
    double yearleft; 
    public Simpleperson(double age, boolean gender){
        this.age= age; 
        this.gender = gender;
        
        if (gender)
        {
            double lifeexpectancy = 86.8;
            yearleft = lifeexpectancy - age;
        }
        else{
            double lifeexpectancy = 80.5;
            yearleft = lifeexpectancy - age;
        }
        return ;
    }
    public static void main(String []arg ){
        Simpleperson p1 = new Simpleperson(45.5, true);
        System.out.println(p1);
    }
}
