import javax.swing.JOptionPane;
public class Array2D4
{
    public static void main (String [] arg){
        int rowinput = (Integer.parseInt(JOptionPane.showInputDialog("Number of row")));
        int columninput =(Integer.parseInt(JOptionPane.showInputDialog("Number of column")));
        String [] letter = {"A", "B" ,"C", "D", "E" ,"F" , "G" ,"H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [][] letter2Darray = new String [rowinput][columninput];
        int index =0;
        for (int x = 0; x < letter2Darray.length; x++){
            for (int y =0; y < letter2Darray[x].length; y++){
                letter2Darray[x][y]= letter[index];
                System.out.print(letter2Darray[x][y]+ "     ");
                index++;
                if (index == 26){
                    index =0;
                }
            }
            System.out.print("\n");
        }
        
    }
}
