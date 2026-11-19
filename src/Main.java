public class Main {
    static void main(String[] args) {
        Store netto = new Store();
        Register register = new Register(netto);


        register.printReceipt(register.calculateItems(netto.allItems,netto.discountedItems,Robot.fyldIKurv(netto.allItems)));
    }
}
