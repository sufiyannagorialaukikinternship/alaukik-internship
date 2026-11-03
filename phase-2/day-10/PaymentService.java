import java.util.*;
public interface PaymentService
{
    public void makePayment(PaymentDetails paymentDetails);
    public List<PaymentDetails> showPaymentHistory();
}