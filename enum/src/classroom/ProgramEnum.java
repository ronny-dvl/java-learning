package classroom;

import java.util.Date;

public class ProgramEnum {

    public static void main(String[] args) {

        // Criando um pedido (Order)
        // 1080 = número/id do pedido
        // new Date() = data atual
        // OrderStatus.PENDING_PAYMENT = status inicial do pedido
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        // Criando uma variável do tipo enum
        // Definindo o status como DELIVERED
        OrderStatus os1 = OrderStatus.DELIVERED;

        // valueOf() pega uma String e transforma em enum
        // Obs: O texto precisa ser exatamente igual ao nome do enum
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        // Exibe os dados do pedido
        System.out.println(order);

        // Exibe o valor do enum
        System.out.println(os1);

        // Exibe o enum convertido da String
        System.out.println(os2);

        }

    }
