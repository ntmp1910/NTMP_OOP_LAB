public class StoreTest {
    public static void main(String[] args){
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 11.95f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("NTMP", "NTMP","NTMP",123, 18.19f);
        store.addMedia(dvd3);
        store.Printlist();
    }
}