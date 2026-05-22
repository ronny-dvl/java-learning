package OrderProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Product product;

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth Date (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        Client client = new Client(name, email, date);

        System.out.println("Enter Order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 1; i<=n; i++){
            sc.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);

        }

        System.out.print(order);


        sc.close();
    }
}
