public class Jukebox
{

    MySong[][] songList = new MySong[3][4];
    public Jukebox()
    {
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );

    }

    public MySong randomSong()
    {
        return songList[(int)(songList.length*Math.random())][(int)(songList[0].length*Math.random())];
    }

    public void SongofRating(int rating)
    {
        System.out.println("Rating: " + rating);
        for(int col = 0; col < songList[0].length; col++)
        {
            for(int row = 0; row < songList.length; row++)
            {
                if(songList[row][col].getRating == rating)
                {
                    System.out.println(MySong.getName());

                } 
            } 

        }
    }

    public String toString()
    {
        String output = new String();
        for ( int x = 0; x < songList.length; x++ )
        {
            for( int y = 0; y < songList[0].length; y++ )
            {
                output += x + "\n";
            }
        }

        return output;
    }

}