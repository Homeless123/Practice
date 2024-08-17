package day17_customClass;

public class ItemClients {
    public static void main(String[] args) {
        Item water = new Item();
        water.itemName="Water";
        water.unitPrice=3.5;
        water.quantity=2;
        System.out.println(water);
        System.out.println(water.calcCost());

        Item pancake = new Item();

        pancake.itemName="Pancake";
        pancake.unitPrice=11.5;
        pancake.quantity=1;
        System.out.println(pancake);

        System.out.println(pancake.calcCost());


    }


}
