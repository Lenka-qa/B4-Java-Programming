package day05_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand ="Apple";
        String model = "iPhone 13";
        String color = "Red";
        double price = 999.99;
        int storage =256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage);
        System.out.println("Has camera: " + hasCamera);
        System.out.println("Sim: " + sim);

        System.out.println("I just bought" + model + "from" + brand);
        System.out.println("It is in the color of " + " and it has " + storage + "GB");
        System.out.println("It has \" + sim + \" sim card and with the camera being \" + hasCamera + \", the total price $\" + price");

        System.out.println();
        System.out.println("I just bought " + model + " from " + brand + "\nIt is in the color of " + color + " and it has " + storage + " GB" + "\nIt has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price);

        System.out.println();
        String fullMessage = "I just bought " + model + " from " + brand + "\nIt is in the color of " + color + " and it has " + storage + " GB" + "\nIt has " + sim + " sim card and with the camera being " + hasCamera + ", the total price $" + price;
        System.out.println(fullMessage);

    }
}
