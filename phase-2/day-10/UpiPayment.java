import java.util.*;
public class UpiPayment implements PaymentService
{
    private List<PaymentDetails> paymentHistory;
    
   public UpiPayment()
   {
    paymentHistory=new LinkedList();
    }
    public void makePayment(PaymentDetails paymentDetails)
    {
       paymentDetails.setPaymentTime(new Date());
       paymentHistory.add(paymentDetails);
       System.out.println("Upi payment is done of amount rs :"+paymentDetails.getPaymentAmount());
    }
    public List<PaymentDetails> showPaymentHistory()
    {
        return this.paymentHistory;
    }
    }