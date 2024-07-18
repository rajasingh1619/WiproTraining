package com.wipro.task3;

class Bill {

    public double findPrice(int itemId) {
        switch (itemId) {
            case 1:
                return 100.0;
            case 2:
                return 150.0;
            case 3:
                return 200.0;
            default:
                return 0.0;
        }
    }

    public double findPrice(String brandName, String itemType, int size) {
        if (brandName.equals("Brand1") && itemType.equals("Type1") && size == 10) {
            return 120.0;
        } else if (brandName.equals("Brand2") && itemType.equals("Type2") && size == 12) {
            return 180.0;
        } else if (brandName.equals("Brand3") && itemType.equals("Type3") && size == 15) {
            return 250.0;
        } else {
            return 0.0; 
        }
    }
}
public class PriceTesterQn {
    public static void main(String[] args) {
        Bill bill = new Bill();

        int itemId1 = 1;
        double price1 = bill.findPrice(itemId1);
        System.out.println("Price for item with itemId " + itemId1 + ": $" + price1);

        int itemId2 = 3;
        double price2 = bill.findPrice(itemId2);
        System.out.println("Price for item with itemId " + itemId2 + ": $" + price2);

        int itemId3 = 5;
        double price3 = bill.findPrice(itemId3);
        System.out.println("Price for item with itemId " + itemId3 + ": $" + price3);

       
    }
}

