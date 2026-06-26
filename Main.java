import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = input.nextLine();
    System.out.println("\nHello " + name + ". Welcome to the tester class.");

    Destination annandale = new Destination();
    System.out.println("Destination: " + annandale);

    String[] names = {"Sweatpants", "Microwave", "TV"};
    int[] prices = {85, 15, 500};

    System.out.println("\nChoose item: 1) Sweatpants 2) Microwave 3) TV");
    int nameNum = input.nextInt();
    String itemName = (nameNum >= 1 && nameNum <= 3) ? names[nameNum-1] : "Rug";

    System.out.println("Choose price: 1) $85 2) $15 3) $500");
    int priceNum = input.nextInt();
    double itemPrice = (priceNum >= 1 && priceNum <= 3) ? prices[priceNum-1] : 75;

    Package num1 = new Package(itemName, itemPrice, annandale);
    System.out.println("\nPackage 1: " + num1);

    Package num2 = new Package(itemName, Math.random() * itemPrice, annandale);
    System.out.println("Package 2: " + num2);
    System.out.println("Equal? " + num1.equals(num2));

    String[] newNames = {"Socks", "Watch", "Mirror"};
    System.out.println("\nChoose new item name: 1) Socks 2) Watch 3) Mirror");
    int newNameNum = input.nextInt();
    num1.setItemName((newNameNum >= 1 && newNameNum <= 3) ? newNames[newNameNum-1] : "Laptop");
    System.out.println("Updated Package 1: " + num1);
    System.out.println("Still equal? " + num1.equals(num2));

    System.out.println("Total packages created: " + Package.getNumPackages());
  }
}
