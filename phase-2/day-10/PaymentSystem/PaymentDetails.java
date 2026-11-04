import java.util.*;
public class PaymentDetails
{
    private String accountNumber;
    private double paymentAmount;
    private Date paymentTime;
 
public String getAccountNumber() {
    return accountNumber;
}

public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}

public double getPaymentAmount() 
{
    return paymentAmount;
}

public void setPaymentAmount(double paymentAmount) {
    this.paymentAmount = paymentAmount;
}

public Date getPaymentTime() {
    return paymentTime;
}

public void setPaymentTime(Date paymentTime) { 
    this.paymentTime = paymentTime;
}
}