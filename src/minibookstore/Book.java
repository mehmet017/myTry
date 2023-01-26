package minibookstore;

public class Book extends Product{

        private String authorName;
        private String publisher;

    public Book(String id, String name, String price, int stock,String authorName,String publisher) {
        super(id, name, price, stock);
        this.authorName=authorName;
        this.publisher=publisher;
    }
}
