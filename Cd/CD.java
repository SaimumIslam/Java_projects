import java.util.*;
import java.io.Serializable;
import java.lang.*;


public class CD implements Serializable {
    private String artist;
    private int numberOfTracks;
    protected String title;
    protected int playingTime;
    
    public CD(){
    //super();
    }

   public CD(String theTitle, String theArtist, int tracks, int time)  {
       // super(theTitle, time);
        title = theTitle;
        playingTime = time;
        artist = theArtist;
        numberOfTracks = tracks;
    }

   public String getArtist() {
        return artist;
    }

   public int getNumberOfTracks() {
        return numberOfTracks;
    }
   
   public String toString()  {
     String result = "CD : " + title + " (" + playingTime + " mins)\n";
        result += "    artist: " + artist + "\n";
        result += "    number of tracks: " + numberOfTracks + "\n";
        return result;
    }
}