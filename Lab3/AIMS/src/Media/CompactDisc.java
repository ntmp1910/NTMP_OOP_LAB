import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList <Track> trackList = new ArrayList<>();
    private int numberOfSong = 0;
    public  CompactDisc(String title, String category, String director,String artist,int length, double cost) {
        super(title,category,director,length,cost);
        this.artist = artist;
    }
    public String getArtist(){
        return artist;
    }
    public void play(){
        System.out.println("=======START PLAY TRACKS LIST=======");
        for(Track track: trackList){
            track.play();
        }
    }
    public int getLength(){
        int totalLength = 0;
        for(Track track : trackList){
            totalLength+=track.getLength();
        }
        return totalLength;
    }
    @Override
    public void toStringMedia(int rank){
        System.out.println(rank + ".CompactDisc - " + this.getTitle() + " - " + this.getCategory()+ " - " + this.getDirector() +  " - " + this.getArtist() + " - " + this.getLength()+ " - " + this.getCost() + " $");
    }
    public boolean isMatchCompactDisc(CompactDisc item){
        return this.id == item.id &&
                this.title.equals(item.getTitle())&&
                this.category.equals(item.getCategory()) &&
                this.cost == item.cost &&
                this.director.equals(item.getDirector()) &&
                this.length == item.length &&
                this.artist.equals(item.getArtist());
    }
}