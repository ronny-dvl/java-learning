package exercise_03;
import java.util.Scanner;

public class MainEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data - \nName: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name , price, quantity);

        product.setName("Compurter");
        product.setPrice(3000.00);

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products added is stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);

        System.out.println("Product data: " + product);

    }

}
