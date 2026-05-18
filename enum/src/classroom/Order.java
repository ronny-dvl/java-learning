package classroom;

import java.util.Date;

// Classe que representa um Pedido
public class Order {

    // ID do pedido
    private Integer id;

    // Data e horário do pedido
    private Date moment;

    // Status atual do pedido usando ENUM
    private OrderStatus status;

    // Construtor vazio
    // Para criar um objeto sem passar dados inicialmente
    public Order(){
    }

    // Construtor com parâmetros
    // Cria o pedido já com id, data e status
    public Order(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // para mostrar os dados do objeto formatados
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}