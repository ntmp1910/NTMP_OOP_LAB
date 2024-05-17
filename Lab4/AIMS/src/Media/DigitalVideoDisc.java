import java.lang.String;
import java.util.Scanner;
public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc(String title, String category,String director,int length, double cost) {
        super(title,category,director,length,cost);
    }
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public void toStringDVD(int rank){
        System.out.println(rank + ".DVD - " +  this.getCategory()+ " - " + this.getDirector() + " - " + this.getLength()+ " - " + this.getCost() + " $");
    }
    public boolean isMatchDVD(DigitalVideoDisc item){
        if(item == null) return false;
        return
                this.title == item.getTitle() &&
                        this.category == item.getCategory() &&
                        this.director == item.getDirector() &&
                        this.length == item.getLength() &&
                        this.cost == item.getCost();
    }
}






