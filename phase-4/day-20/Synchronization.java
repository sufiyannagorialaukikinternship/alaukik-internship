class Counter
{
    private int count;
    public synchronized void increment()
    {
        count++;
    }
    public int getCount()
    {
        return this.count;
    }
}
class MyThread extends Thread
{
    private Counter counter;
MyThread(Counter  counter)
{
    this.counter=counter;
}
public void run()
{
    for(int i=0;i<1000;i++)
    {
        counter.increment();
    }
}
}
class Synchronization
{
    public static void main(String gg[])
{
    Counter counter=new Counter();
      MyThread t1=new MyThread(counter);
      MyThread t2=new MyThread(counter);
      t1.start();
      t2.start();
      try
      {
        t1.join();
        t2.join();
      }catch(Exception e)
      {}
      System.out.println("Counter count is :"+counter.getCount());
}
}   