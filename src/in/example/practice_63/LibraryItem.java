package in.example.practice_63;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Check out ");
    }

    public void returnItem(){
        System.out.println(" Returned ");
    }
}
