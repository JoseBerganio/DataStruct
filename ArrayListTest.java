import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner scanItem = new Scanner(System.in);
        int key = -1;

        while (key != 3) {
            System.out.println("Enter 1 to Add Item");
            System.out.println("Enter 2 to View Items");
            System.out.println("Enter 3 to Exit");
            key = sc.nextInt();

            switch (key) {
                case 1:
                    System.out.print("Kindly Enter your Item: ");
                    String newItem = scanItem.nextLine();
                    fruits.add(newItem);
                    break;
                case 2:
                    System.out.println("Here are the items: ");
                    System.out.println(fruits.getStringItems());
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("You Entered Invalid Number");
                    break;
            }
            System.out.println("Enter Any Key: ");
            scanItem.nextLine();

            System.out.println("================");
        }
        sc.close();
        scanItem.close();
    }
}