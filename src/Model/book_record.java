
package Model;

public class book_record {
    private String id;
    private String book_name;
    private String provider;
    private String time;
    private String prices;
    private String number;

    public book_record() {
    }

    public book_record(String id, String book_name, String provider, String time, String prices, String number) {
        this.id = id;
        this.book_name = book_name;
        this.provider = provider;
        this.time = time;
        this.prices = prices;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    
    
    
}
