import java.util.ArrayList;
import java.util.LinkedList;

public class Store {

    public  ArrayList<Item> allItems;
    public ArrayList<Item> discountedItems;

    public Store(){
        this.allItems = loadVare("data/varer.csv");
        this.discountedItems = loadVare("data/tilbud.csv");
    }

    public ArrayList<Item> loadVare(String path){
        ArrayList<String> data = FileIO.readData(path);
        ArrayList<Item> items = new ArrayList<>();
        for (String s : data){
            String[] values = s.split(";");
            long EAN_number = Long.parseLong(values[0].trim());
            String name = values[1].trim();
            String lastDateChange = values[2].trim();
            double price = Double.parseDouble(values[3].trim());
            double quantity = Double.parseDouble(values[5].trim());
            String unit = values[6].trim();

            Item item = new Item(EAN_number, name, lastDateChange, price, quantity, unit);
            items.add(item);
        }
        return items;
    }

    public Item getItemByEAN(long EAN, ArrayList<Item> items){
        for (Item i : items){
            if (EAN == i.getEAN_number()){
                return i;
            }
        }
        return null;
    }

}
