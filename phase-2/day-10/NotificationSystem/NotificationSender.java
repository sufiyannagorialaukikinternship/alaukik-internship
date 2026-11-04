import java.util.*;
public class NotificationSender
{
private static Scanner sc=new Scanner(System.in);
    public static void sendMessage(NotificationRequest request)
    {
    if(request.getType().toString().equalsIgnoreCase("SMS"))
    {
sendSMS(request.getReceipient(),request.getMessage());
    }
    else if(request.getType().toString().equalsIgnoreCase("WHATSAPP"))
    {
sendWhatsapp(request.getReceipient(),request.getMessage());
    }
    else if(request.getType().toString().equalsIgnoreCase("EMAIL"))
    {
        sendEmail(request.getReceipient(),request.getSubject(),request.getMessage());
    }
    else System.out.println("Please choose correct method of message");
    }

public static void sendSMS(String recepient,String message)
{
        System.out.println("********************SMS**************************");
    System.out.println("SMS :"+message);
    System.out.println("Sent successfully to the :"+recepient);
       System.out.println("****************************************************");
       System.out.println("Press Enter to continue.............");
       sc.nextLine();

}
public static void  sendWhatsapp(String recepient,String message)
{
        System.out.println("********************Whatsapp***********************");
       System.out.println("Whatsapp Message :"+message);
    System.out.println("Sent successfully to the :"+recepient);
       System.out.println("****************************************************");
       System.out.println("Press Enter to continue.............");
       sc.nextLine();

}
public static void sendEmail(String recepient,String subject, String message)
{
    System.out.println("********************Email***********************");
       System.out.println("Subject :"+subject);
       System.out.println("Message :"+message);
    System.out.println("Sent successfully to the :"+recepient);
    System.out.println("************************************************");
    System.out.println("Press Enter to continue.............");
    sc.nextLine();
}
}