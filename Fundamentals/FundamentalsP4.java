import java.util.Random;
public class FundamentalsP4
{ 
    public static void main (String [] args)
    {
        for( int ctr = 1; ctr <= 10; ctr ++)
        {
            System.out.println ( ctr +"\t" + ctr*ctr + "\t" +(int)(ctr+ ctr *Math.random()) );
        }//end for
    }
}
        
