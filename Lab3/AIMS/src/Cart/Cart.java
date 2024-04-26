import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    public static final int cnt = 99;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    public static  int countcur =0 ;
    public void addMedia(Media media){
        if(itemsOrdered.size() >= cnt){
            System.out.println("The cart is full. Please remove some items to continue.");
        }
        else{
            itemsOrdered.add(media);
            countcur++;
            System.out.println("The media has been added to the cart");
            if(itemsOrdered.size() >= 90){
                System.out.println("The cart is almost full");
            }
        }
    }
    public void removeMedia(Media media){
        if(itemsOrdered.remove(media)){
            System.out.println("The media has been removed from the cart");
            countcur--;
        } else {
            System.out.println("The media is not found in cart.");
        }
    }

    // Phương thức tính tổng chi phí
    public double totalCost(){
        double total = 0;
        for(Media media : itemsOrdered){
            total += media.getCost();
        }
        return total;
    }
    public void orderedItems(){
        if(itemsOrdered.isEmpty()){
            System.out.println("There are no items in the cart.");
        }
        else{
            System.out.println("***********************CART***********************");
            System.out.println("Ordered Items:");
            for(int i = 0; i < itemsOrdered.size(); i++){
                itemsOrdered.get(i).toStringMedia(i + 1);
            }
            System.out.println("**************************************************");
            System.out.println("Total Cost is: " + totalCost() + "$");
        }
    }
    public void searchByTitle(String title){
        if(itemsOrdered.isEmpty()){
            System.out.println("There are no items in the cart.");
        }
        else{
            int count = 0;
            System.out.println("List of items with title \"" + title + "\":");
            for(Media media : itemsOrdered){
                if(media.getTitle().equals(title)){
                    media.toString();
                    count++;
                }
            }
            if(count == 0){
                System.out.println("No items found with title \"" + title + "\" in the cart.");
            }
        }
    }
    public int numberDVD(){
        int cnt = 0 ;
        for(Media item : itemsOrdered){
            if(item instanceof DigitalVideoDisc) {
                cnt++;
            }
        }
        return cnt;
    }
    public void filterByTitle(String title) {
        ArrayList<Media> filteredList = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                filteredList.add(media);
            }
        }
        if (filteredList.isEmpty()) {
            System.out.println("No items found with title \"" + title + "\" in the cart.");
        } else {
            System.out.println("Items with title \"" + title + "\":");
            for (Media media : filteredList) {
                media.toStringMedia(itemsOrdered.indexOf(media) + 1);
            }
        }
    }
    public void sortByTitle() {
        Collections.sort(itemsOrdered, Comparator.comparing(Media::getTitle));
        System.out.println("Items sorted by title:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            itemsOrdered.get(i).toStringMedia(i + 1);
        }
    }
    public void sortByCost() {
        Collections.sort(itemsOrdered, Comparator.comparing(Media::getCost));
        System.out.println("Items sorted by cost:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            itemsOrdered.get(i).toStringMedia(i + 1);
        }
    }
    public void playMedia(Media media) {
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            dvd.play();
        } else {
            System.out.println("Cannot play this type of media.");
        }
    }
    public void placeOrder() {
        System.out.println("An order has been created.");
        itemsOrdered.clear(); // Xóa giỏ hàng sau khi đặt hàng
    }
    public Media searchMedia(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
    public void Printlist(){
        System.out.println("Ordered Items:");
        for(int i=0;i< countcur; i++)
        {
            System.out.println(i+1 + ".DVD-" + itemsOrdered.get(i).getTitle()+"-" + itemsOrdered.get(i).getCategory()+"-"+itemsOrdered.get(i).getCost()+"$");
        }
        System.out.println("Total cost: "+ totalCost());
    }
}






