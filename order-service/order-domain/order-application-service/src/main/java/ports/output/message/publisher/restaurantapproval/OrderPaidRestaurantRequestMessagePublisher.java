package ports.output.message.publisher.restaurantapproval;

import domain.event.OrderPaidEvent;
import domain.event.publisher.DomainEventPublisher;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
