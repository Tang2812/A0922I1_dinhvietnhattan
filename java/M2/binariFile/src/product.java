import java.io.Serializable;

public class product implements Serializable {
    private static final long serialVersionUID = 1L;
    String code;
    String name;
    String manufacturer;
    int price;
    public product(String code, String name, String manufacturer, int price) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }




    @Override
    public String toString() {
        return this.code+","+this.name+","+this.manufacturer+","+this.price;
    }
}
