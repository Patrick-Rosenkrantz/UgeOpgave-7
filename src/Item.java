import java.util.ArrayList;

public class Item {

    private long EAN_number;
    private String name;
    private String lastDateChange;
    private double price;
    private double quantity;
    private String unit;


    public Item(long EAN_number, String name, String lastDateChange, double price, double quantity, String unit) {
        this.EAN_number = EAN_number;
        this.name = name;
        this.lastDateChange = lastDateChange;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }



    public long getEAN_number() {
        return EAN_number;
    }

    public void setEAN_number(long EAN_number) {
        this.EAN_number = EAN_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastDateChange() {
        return lastDateChange;
    }

    public void setLastDateChange(String lastDateChange) {
        this.lastDateChange = lastDateChange;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
