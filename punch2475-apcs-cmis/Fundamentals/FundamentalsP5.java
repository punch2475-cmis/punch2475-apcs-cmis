public class FundamentalsP5{
        public static void main ( String [] arg)
       { String [] favoriteMovie = { "Divergent", "Harry Potter", "Maze Runner"};
        
        for( String Movies : favoriteMovie ){
                System.out.println("My favorite movie is " + Movies );
            
            }
             System.out.println("\n"+"\n");
             String [] favSong = {"Song1", "Song2", "Song3"};
             int  x =0 ;
             while (x < favSong.length-1)
             {
                 System.out.print(favSong[x] + ",");
                 x++;

            }
            System.out.print(favSong[favSong.length -1]);
   }
}
    