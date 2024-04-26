public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }
    public Track(String title){
        this.title = title;
    }

    public void play(){
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    public boolean MatchTrack(Track itemSong){
        return this.getTitle() == itemSong.getTitle() && this.getLength() == itemSong.getLength();
    }
    @Override
    public boolean equals(Object test) {
        if (this == test) return true;
        if (test == null || getClass() != test.getClass()) return false;
        Track track = (Track) test;
        return length == track.length && title.equals(track.title);
    }
}