import java.util.*;
public class NetBankingPayment implements PaymentService
{
    private List<PaymentDetails> paymentHistory;
   public NetBankingPayment()
   {
    paymentHistory=new LinkedList();
    }
        public void makePayment(PaymentDetails paymentDetails)
    {
       paymentDetails.setPaymentTime(new Date());
       paymentHistory.add(paymentDetails);
       System.out.println("Card payment is done of amount Rs :"+paymentDetails.getPaymentAmount());
    }
    public List<PaymentDetails> showPaymentHistory()
    {
        return this.paymentHistory;
    }
    
    }