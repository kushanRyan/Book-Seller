
package Model;

public class Prices {
    private int id;
    private String related_book_name ;
    private String related_provider_name;
    private double price;

    public Prices() {
        
    }

    public Prices(int id, String related_book_name, String related_provider_name, double price) {
        this.id = id;
        this.related_book_name = related_book_name;
        this.related_provider_name = related_provider_name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRelated_book_name() {
        return related_book_name;
    }

    public void setRelated_book_name(String related_book_name) {
        this.related_book_name = related_book_name;
    }

    public String getRelated_provider_name() {
        return related_provider_name;
    }

    public void setRelated_provider_name(String related_provider_name) {
        this.related_provider_name = related_provider_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
