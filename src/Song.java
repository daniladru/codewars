import java.util.ArrayList;
import java.util.Locale;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listeners;

    Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.listeners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> daylisteners) {
        int result = 0;
        for (String listener :
                daylisteners) {
            if (listeners.indexOf(listener.toLowerCase(Locale.ROOT)) == -1) {listeners.add(listener.toLowerCase(Locale.ROOT)); result++;}
        }
        return result;
    }
}
