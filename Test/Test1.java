import javax.swing.JOptionPane;
public class Test1
{
    public static void main(String []arg)
    {
        String input = JOptionPane.showInputDialog( "Type a number: " );
        int num = Integer.parseInt(input);
        double [] randomnumbers = new double [num];
        int [] randomnumbers2 = new int [num];
        int [] counts = new int [num];
        for( int  index = 0; index < randomnumbers.length; index++){
            randomnumbers[index] = ((double)((Math.random() * 50) +1));
            counts[randomnumbers2[index]]++;
            
             System.out.println( index + ": " + randomnumbers[index]);
        }// for loop
        /*for (int index = 0; index < counts.length; index++)
        {
            if (randomnumbers[index] %2 ==0)
            {
                int even = counts[randomnumbers2[index]];
                while (even > 0){
                    System.out.print("E");
                    even--;
                     System.out.println( index + ": " + randomnumbers[index]);
                }
            }
            else{
                int odd = counts[index];
                while (odd > 0)
                {
                    System.out.print("O");
                    odd--;
                    
                }
            }
            System.out.println();*/
            
            for ( int i = counts.length; i > 0; i--)
            {
                System.out.println(i + ": " );

            }
        //end for loop
        
    }//end main
}//end class