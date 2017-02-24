public class recursion
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int Newpow;
    public static void main ( String args[] ){
        
    }

    public int pow(int x, int y)
    {
        if ( y < 0){
             Newpow = x*x ;
            y++;
        }
        else{
            System.out.println(Newpow);
        }
        return pow(5,2);
    }
}
