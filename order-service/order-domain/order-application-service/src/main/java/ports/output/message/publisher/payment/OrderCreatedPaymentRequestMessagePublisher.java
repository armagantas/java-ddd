package ports.output.message.publisher.payment;

import domain.event.OrderCreatedEvent;
import domain.event.publisher.DomainEventPublisher;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
