import javax.swing.JOptionPane;
public class Bigproblem1
{
    public static void main(String []arg)
    {
        String input = JOptionPane.showInputDialog( "Type a number: " );
        int b = Integer.parseInt(input);
        int [] randomnumbers = new int [b];
        int sum = 0;
        int big =0; 
        int small =0;
        int total = 0;
        //for (i = 1; i < randomnumbers; i++)
        //{
          //  randomnumbers[index] =(int) ( Math.random()*100); 
            //randomnumbers[total]++;
        //}
        //for( total =2; total <= randomnumber
        for (int index =0; index< randomnumbers.length; index++)
        {
            
            System.out.println( randomnumbers[index]);
            sum += randomnumbers[index];
            int newran = randomnumbers[index];
            if (index ==1)
            {
                small = randomnumbers[index];
            }
            else{
                if (small > newran){
                    small= randomnumbers[index];
                }
            }
            if (index ==1 )
            {
                big = randomnumbers[index];
            }
            else{
                if (big < newran)
                {
                    big = randomnumbers[index];
                }
            }
            
        }
        int avg = sum/b;
        System.out.println("Sum =" + sum);
        System.out.println("Avg =" +avg);
        System.out.println("Smallest num = " + small);
        System.out.println("Biggest num = " + big);
        
        
        //sum += randomnumbers 
        
            
        }
    }
    

/*
 * //ask user to type number
 * //random number 0-99 
 * count how many time it occur
 * print histogram
 * //print minimum 
 * //print max
 * //print sum
 * print mode
 * //print avg
*/