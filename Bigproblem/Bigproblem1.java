import javax.swing.JOptionPane;
public class Bigproblem1
{
    public static void main(String []arg)
    {
        String input = JOptionPane.showInputDialog( "Type a number: " );
        int b = Integer.parseInt(input);
        int [] randomnumbers = new int [b];
        int sum = 0;

        for (int index =0; index< randomnumbers.length; index++)
        {
            randomnumbers[index] =(int) ( Math.random()*100);
            System.out.println( randomnumbers[index]);
            sum += randomnumbers[index];
        }
        int avg = sum/b;
        System.out.print("Sum =" + sum);
        System.out.print("Avg =" +avg);
        
        //sum += randomnumbers 
        
            
        }
    }
    

/*
 * //ask user to type number
 * //random number 0-99 
 * count how many time it occur
 * print histogram
 * print minimum 
 * print max
 * //print sum
 * print mode
 * //print avg
*/