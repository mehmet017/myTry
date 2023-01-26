package minibookstore;

public class Product {
    private String Id;
    private String name;
    private String price;
    private int stock;

    public Product(String id, String name, String price, int stock) {
        Id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return  "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stock=" + stock;
    }
}
