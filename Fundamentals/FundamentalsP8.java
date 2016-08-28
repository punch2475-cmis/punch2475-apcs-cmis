public class FundamentalsP8
    { public static void main (String args [])
        {
            String[] artist = {" Artist1", "Artist2", " Artist3"};
            
            for(int index = 0; index < 0; index++)
            {
                System.out.println(artist [index]);
            }//end for loop
            artist[(int)(3* Math.random())] = "Michael Jackson";
            for (int index =0; index < artist.length; index++)
            {
                System.out.println(artist[index]);
            }//end for loop
            System.out.println("\n");
            for (int index =0; index < artist.length; index++)
            {
                if (artist[index].equals("Micheal Jackson"))
                { 
                    System.out.println("We found Micheal Jackson");
                }
                else 
                {
                    System.out.println("No Micheal in music" +index);
                }
            }
    }
    }
