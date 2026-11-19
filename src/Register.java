import java.util.ArrayList;
import java.util.LinkedList;

public class Register {

    public Register(Store store) {
    }

    public double calculateTax(double cost) {
        return cost * 0.2;
    }

    public void scanItem(Item item, ArrayList<Item> kurv) {
        if (!(kurv.contains(item))) {
            kurv.add(item);
        }
    }

    public ArrayList<Item> calculateItems(ArrayList<Item> allItems, ArrayList<Item> discountedItems, ArrayList<Item> kurv) {
        kurv = Robot.fyldIKurv(allItems);
        for (Item i : kurv) {
            for (Item disItem : discountedItems) {
                if (i.getEAN_number() == disItem.getEAN_number() && i.getPrice() != disItem.getPrice()) {
                    double oldPrice = i.getPrice();   // gem den gamle pris FØR du ændrer den
                    i.setPrice(disItem.getPrice());
                    System.out.println(i.getName() + " is discounted!\nOld price: " + oldPrice
                            + "\nNew price: " + disItem.getPrice());
                }
            }
        }
        return kurv;
    }

    private final String RECEIPT_HEADER = "====RECEIPT====";

    public void printReceipt(ArrayList<Item> kurv) {
        double totalCost = 0;
        System.out.println(RECEIPT_HEADER);
        ArrayList<Item> unikke = new ArrayList<>();
        for (Item item : kurv) {
            boolean findes = false;
            for (Item u : unikke) {
                if (u.getEAN_number() == item.getEAN_number()) {
                    findes = true;
                    break;
                }
            }
            if (!findes) {
                unikke.add(item);
            }
        }

        for (Item u : unikke) {
            int count = 0;
            for (Item item : kurv) {
                if (item.getEAN_number() == u.getEAN_number()) {
                    count++;
                }
            }
            double linjePris = count * u.getPrice();
            System.out.println(u.getName() + "         " + u.getPrice() + " X " + count + " = " + linjePris);
            totalCost += linjePris;
        }

        System.out.println("Total cost: " + totalCost);
        System.out.println("Tax: " + calculateTax(totalCost));
    }
}





