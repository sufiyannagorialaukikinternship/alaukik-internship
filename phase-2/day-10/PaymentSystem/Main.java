import java.util.*;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
         PaymentService cardPayment=new CardPayment();
         PaymentService upiPayment=new UpiPayment();
         PaymentService netBankingPayment=new NetBankingPayment();
        List<PaymentDetails> paymentHistory=null;         
        PaymentDetails paymentDetails=null;
        while(true)
        {
                
            System.out.println("1.Make a Payment :");
            System.out.println("2.Show Payment History :");
            System.out.print("Choose operation from 1-2 to operation :");
            int num=sc.nextInt();
            if(num==1)
            {
                System.out.print("Enter amount you want to pay :");
                double paymentAmount=sc.nextDouble();

                if(paymentAmount<=0) 
                {
                    System.out.println("Please Choose Valid amount amount is not zero of less than zero");
                    continue;
                }
                System.out.print("Enter Account number to pay :");

                if(sc.hasNext()) sc.nextLine();
                String accountNumber=sc.nextLine();
                paymentDetails=new PaymentDetails();

                 paymentDetails.setAccountNumber(accountNumber);
                paymentDetails.setPaymentAmount(paymentAmount);

                System.out.println("1.UPI payement");
                System.out.println("2.Card payement");
                System.out.println("3.Net Banking payement");
                System.out.print("Choose Payment Method :");
                num=sc.nextInt();
                if(num==1)
                {
                  upiPayment.makePayment(paymentDetails);
                }else
                if(num==2)
                { 
                    cardPayment.makePayment(paymentDetails);
                }
                else if(num==3)
                {
                     netBankingPayment.makePayment(paymentDetails);
                }

            }
            else if(num==2)
            {
                System.out.println("1.UPI payment history.");
                System.out.println("2.Card payment history.");
                System.out.println("2.Net Banking payment history.");
                System.out.print("Enter number to see history :");
                num=sc.nextInt();
String historyMethod="";                
                if(num==1)
                {
                    paymentHistory=upiPayment.showPaymentHistory();
                    historyMethod="UPI Payment History";
                }
                else if(num==2)
                {
                       paymentHistory=cardPayment.showPaymentHistory();
                      historyMethod="Card Payment History";
                }
                else if(num==3)
                {
                       paymentHistory=netBankingPayment.showPaymentHistory();
                 historyMethod="Net Banking Payment History";
                }
                System.out.println("********************"+historyMethod+"**********************");
                System.out.println("Size of payement history is :"+paymentHistory.size());
                paymentHistory.forEach((history)->{
                 System.out.println("Payment Amount :"+history.getPaymentAmount());
                 System.out.println("Trasferred to account Number  :"+history.getAccountNumber());
                 System.out.println("Payment Date :"+history.getPaymentTime());
           System.out.println("---------------------------------------");                
                });

            }
            else 
            {
                System.out.println("Please Choose from 1-2");
            }

        }
    }
}