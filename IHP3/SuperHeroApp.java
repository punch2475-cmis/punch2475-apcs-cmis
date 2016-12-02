import java.util.List;
import java.util.ArrayList;
public class SuperHeroApp
{
    public static void main (String [] args){
        List<SuperHero> heros = new ArrayList<SuperHero>();
        heros.add(new FriedEggMan ());
        heros.add(new AsteroidMan ());
        heros.add(new HahaMan ());
        for (int i = 0; i < heros.size(); i++){
            System.out.println(heros.get(i));
        }

        /*int [][] Hero2DArray = new int [3][3];
        for (int x = 0; x < Hero2DArray.length; x++){
        for (int y =0; y < Hero2DArray[x].length; y++){
        int i =0;
        if (heros.setCape() = true ){
        System.out.println(getClass());
        }

        }
        }
         */

    }
}
