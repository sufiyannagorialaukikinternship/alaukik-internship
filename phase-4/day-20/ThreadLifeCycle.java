class ThreadLifeCycle{
    public static void main(String gg[])
    {
        Thread t=new Thread(()->{
            try
            {
            System.out.println("Thread is running.........");
            Thread.sleep(2000);
            System.out.println("Thread work completed");
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        });
        try
        {
        System.out.println("State: "+t.getState());
        t.start();
             System.out.println("State: "+t.getState());
             t.join();     
             System.out.println("State: "+t.getState());
        }catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}