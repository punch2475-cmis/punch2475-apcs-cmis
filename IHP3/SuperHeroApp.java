import java.util.List;
import java.util.ArrayList;
public class SuperHeroApp
{
    public static void main (String [] args){
        List<SuperHero> heros = new ArrayList<SuperHero>();
        heros.add(new FriedEggMan());
        heros.add(new AsteroidMan());
        heros.add(new HahaMan());

        for (int i = 0; i < heros.size(); i++){
            System.out.println(heros.get(i));
        }

        String [][] Hero2DArray = new String [3][3];
        int i =0;
        /*for (int y = 0; y < Hero2DArray.length; y++){
            for (int x =0; x < Hero2DArray[y].length; x++){

                if (heros.get(i).isCaped() == true){
                    Hero2DArray[x][y] = heros.get(i).getClass().getName(); 
                    System.out.print(Hero2DArray[x][y] + "\t");
                    i++;
                    if (i >3){
                        Hero2DArray[y][x] = null;
                    System.out.print(Hero2DArray[x][y]+ "\t");
                    }
                }
                else if (heros.get(i).isCaped() == false){
                    Hero2DArray[y][x] = null;
                    System.out.print(Hero2DArray[x][y]+ "\t");
                    i++;
                }
            }
            System.out.println("\n");
        }*/

        /*if(heros.get(i).isCaped() == true){
            System.out.print(heros.get(i));
            i++;
        }
        else{
            System.out.println();
            i++;
        }*/
        
    }
}

