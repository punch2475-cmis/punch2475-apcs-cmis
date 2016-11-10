import javax.swing.JOptionPane;
public class Array2D4
{
    public static void main (String [] arg){
        int rowinput = (Integer.parseInt(JOptionPane.showInputDialog("Number of row")));
        int columninput =(Integer.parseInt(JOptionPane.showInputDialog("Number of column")));
        int ULletter = (Integer.parseInt(JOptionPane.showInputDialog(" Choose 1 = upper letter 2 = lower letter 3 = 0-9 ")));
        String [] Upperletter = {"A", "B" ,"C", "D", "E" ,"F" , "G" ,"H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] Lowerletter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String [] num = {"0","1","2","3","4","5","6","7","8","9"};
        String [][] letter2Darray = new String [rowinput][columninput];
        int index =0;
        if (ULletter ==1){
            for (int x = 0; x < letter2Darray.length; x++){
                for (int y =0; y < letter2Darray[x].length; y++){
                    letter2Darray[x][y]= Upperletter[index];
                    System.out.print(letter2Darray[x][y]+ "\t");
                    index++;
                    if (index == 26){
                        index =0;
                    }
                }
                System.out.print("\n");
            }
        } 
        else if (ULletter ==2){
            for (int x = 0; x < letter2Darray.length; x++){
                for (int y =0; y < letter2Darray[x].length; y++){
                    letter2Darray[x][y]= Lowerletter[index];
                    System.out.print(letter2Darray[x][y]+ "\t");
                    index++;
                    if (index == 26){
                        index =0;
                    }
                }
                System.out.print("\n");
            }
        }
        else if (ULletter ==3){
            for (int x = 0; x < letter2Darray.length; x++){
                for (int y =0; y < letter2Darray[x].length; y++){
                    letter2Darray[x][y]= num[index];
                    System.out.print(letter2Darray[x][y]+ "\t");
                    index++;
                    if (index == 10){
                        index =0;
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
