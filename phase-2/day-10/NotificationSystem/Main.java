import java.util.*;
public class Main
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        NotificationRequest request=new NotificationRequest();
        String message="";
        while(true)
        {
            System.out.println("1.Send SMS.");
            System.out.println("2.Send Whatsapp message.");
            System.out.println("3.Send Email.");
            System.out.print("Enter Your choice to send message (1-2):");
            int num=sc.nextInt();
            if(num==1)
            {
               System.out.print("Enter Mobile Number :");
               if(sc.hasNext()) sc.nextLine();
               String mobileNumber=sc.nextLine();
               System.out.print("Enter message :");
            //    if(sc.hasNext()) sc.nextLine();
            //    if(sc.hasNext()) sc.nextLine();
               message=sc.nextLine();
               if(message.trim().length()==0)
               {
                System.out.println("Please enter a proper message");
                continue;
               }
             request=new NotificationRequest();
             request.setReceipient(mobileNumber);
             request.setMessage(message);
             request.setType(NOTIFICATIONTYPE.SMS);
             NotificationSender.sendMessage(request);
            }
            else if(num==2)
            {
                               System.out.print("Enter Mobile Number :");
               if(sc.hasNext()) sc.nextLine();
               String mobileNumber=sc.nextLine();
               System.out.print("Enter message :");
            //    if(sc.hasNext()) sc.nextLine();
            //    if(sc.hasNext()) sc.nextLine();
               message=sc.nextLine();
               if(message.trim().length()==0)
               {
                System.out.println("Please enter a proper message");
                continue;
               }
             request=new NotificationRequest();
             request.setReceipient(mobileNumber);
             request.setMessage(message);
             request.setType(NOTIFICATIONTYPE.WHATSAPP);
             NotificationSender.sendMessage(request);

            }
            else if(num==3)
            {

                               System.out.print("Enter Mobile Number :");
               if(sc.hasNext()) sc.nextLine();
               String mobileNumber=sc.nextLine();
               System.out.print("Enter subject :");
               String subject=sc.nextLine();
               System.out.print("Enter message :");
            //    if(sc.hasNext()) sc.nextLine();
            //    if(sc.hasNext()) sc.nextLine();
               message=sc.nextLine();
               if(message.trim().length()==0)
               {
                System.out.println("Please enter a proper message");
                continue;
               }
             request=new NotificationRequest();
             request.setReceipient(mobileNumber);
             request.setMessage(message);
             request.setSubject(subject);
             request.setType(NOTIFICATIONTYPE.EMAIL);
             NotificationSender.sendMessage(request);

            }
            else {
                System.out.println("Please Choose valid operation from 1-3 to send message");
            }
        }

    }
}