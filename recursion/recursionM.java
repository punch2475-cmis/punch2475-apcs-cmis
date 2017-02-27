public class recursionM
{
    // instance variables - replace the example below with your own
   

    
    public static void main (String [] arg){
        System.out.println(pow(4,5));
    }
      

   public static int pow(int x, int y)
    {
        if(y ==0){
            return 1;
        }
        else{
            return pow(x, y-1)* x;
        }
    }
    

}
