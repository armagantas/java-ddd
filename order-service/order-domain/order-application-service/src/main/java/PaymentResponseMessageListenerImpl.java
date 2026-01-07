import dto.message.PaymentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ports.input.message.listener.payment.PaymentResponseMessageListener;

@Validated
@Slf4j
@Service
public class PaymentResponseMessageListenerImpl implements PaymentResponseMessageListener {

    @Override
    public void paymentCompleted(PaymentResponse paymentResponse) {

    }

    @Override
    public void paymentCancelled(PaymentResponse paymentResponse) {

    }
}
