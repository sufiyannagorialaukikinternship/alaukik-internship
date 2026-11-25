class SingleProcess
{
    public static void main(String gg[])
    {
        long pid=ProcessHandle.current().pid();
        System.out.println("Process Id:"+pid);
        
        System.out.println("Main Thread "+Thread.currentThread().getName());

        Thread t1=new Thread(()->{
            System.out.println("Thread 1 :"+Thread.currentThread().getName());
        });

        Thread t2=new Thread(()->{
            System.out.println("Thread 2 :"+Thread.currentThread().getName());
        });

        Thread t3=new Thread(()->{
            System.out.println("Thread 3 :"+Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
        t3.start();


// Loop threads
for(int i=0;i<3;i++)
{
    Thread t=new Thread(()->{System.out.println("Process id :"+ProcessHandle.current().pid()+" | Thread "+Thread.currentThread().getName());});

    t.start();
}
    }
}