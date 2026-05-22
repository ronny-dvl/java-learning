package OrderProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order(){
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: " + moment.format(fmt)+ "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() +" ("+ fmt2.format(client.getBirthDate()) + ") - "+ client.getEmail()+ "\n");
        sb.append("Order Items:\n");

        for (OrderItem c : items){
            sb.append(c + "\n");
        }
        sb.append("\nTotal price: $" + total());

        return sb.toString();

    }



}
