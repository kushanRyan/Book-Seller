
package Model;

public class Books {
    private int id;
    private String name;
    private String author;
    private int number;
    private double out_price;
    
    public Books() {
    }

    public Books(int id, String name, String author, int number, double out_price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.number = number;
        this.out_price = out_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getOut_price() {
        return out_price;
    }

    public void setOut_price(double out_price) {
        this.out_price = out_price;
    }
    
    
    
}
