import java.util.Random;
public class FundamentalsP4
{ 
    public static void main (String [] args)
    {
        for( int ctr = 1; ctr <= 10; ctr ++)
        {
            Random r= new Random();
            int i1= r.nextInt((ctr*ctr)- ctr); 
            System.out.println ( ctr +"\t" + ctr*ctr + "\t" +i1 );
        }//end for
    }
}
        
