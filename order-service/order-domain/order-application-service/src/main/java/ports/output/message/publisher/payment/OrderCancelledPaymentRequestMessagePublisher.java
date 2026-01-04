package ports.output.message.publisher.payment;

import domain.event.OrderCancelledEvent;
import domain.event.publisher.DomainEventPublisher;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
