package minibookstore;

public class Notebook extends Product{

    private String trademark;
    private String sheet;


    public Notebook(String id, String name, String price, int stock,String trademark,String sheet) {
        super(id, name, price, stock);
        this.trademark=trademark;
        this.sheet=sheet;
    }
}
