 class Book {

    static int totalNoOfBook;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

     static {
         totalNoOfBook = 0;
     }
     { // Object Init
         totalNoOfBook++;
     }
    Book(String title,String author , String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this(isbn , "unknow" , "unknow");
    }

    static int getTotalNoOfBook(){
        return totalNoOfBook;
    }

    void borrowedBook(){
         if (isBorrowed){
             System.out.println("Book is already borrowed .");
         } else {
             this.isBorrowed = true;
             System.out.println("Enjoy :" + title);
         }
    }

    void returnBook(){
         if (isBorrowed){
             this.isBorrowed = false;
             System.out.println("Hope you enjoy the Book . Please leave review.");
         } else {
             System.out.println("Book is already in library.");
         }
    }

     public static void main(String[] args) {

         Book book1 = new Book("Java" ,"Adi" ,"1");
         Book book2 = new Book("HTML" ,"Adi" ,"2");
         Book book3 = new Book("3");
         Book myBook = new Book("4");
         System.out.println(Book.getTotalNoOfBook());
         book1.borrowedBook();
         book2.borrowedBook();
         book3.borrowedBook();
         myBook.borrowedBook();

         book1.returnBook();;
         book2.returnBook();
         book1.returnBook();
         myBook.returnBook();
         myBook.returnBook();

     }
}
