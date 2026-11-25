class MyTask implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
         System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
class Main
{
    public static void main(String gg[])
    {
        MyTask task=new MyTask();
        Thread t1=new Thread(task);
        t1.start();

        Thread t2=new Thread(task);
        t2.start();
    }
}