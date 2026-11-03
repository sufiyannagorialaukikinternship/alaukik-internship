 class Payement
{
    public void makePayement(double payementAmount)
    {
        System.out.println("Payement is done of Rs :"+payementAmount);
    }
}
 class CardPayement extends Payement
{
    public void makePayement(double payementAmount)
    {
        System.out.println("Card Payement is done of amount Rs :"+payementAmount);
    }
}
class UpiPayement extends Payement
{
    public void makePayement(double payementAmount)
    {
        System.out.println("Upi Payement is done of amount Rs :"+payementAmount);
    }
}
class CashPayement extends Payement
{
    public void makePayement(double payementAmount)
    {
        System.out.println("Cash Payement is done of amount Rs :"+payementAmount);
    }

}
 class PayementProcessingSystem
{
    public static void main(String gg[])
    {
      Payement p=new CardPayement();
      p.makePayement(1000);
      
      p=new UpiPayement();
      p.makePayement(3000);
      
       p=new CashPayement();
      p.makePayement(1000);
      
    }
}