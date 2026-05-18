package classroom;

// Crinado enum para uma lista fixa de constantes
public enum OrderStatus {

    // Pedido aguardando pagamento
    PENDING_PAYMENT,

    // Pedido está sendo processado
    PROCESSING,

    // Pedido foi enviado
    SHIPPED,

    // Pedido foi entregue
    DELIVERED;
}