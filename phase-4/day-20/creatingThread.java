class NumberThread extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Number :"+i);
        }
    }
}
class LetterThread extends Thread
{
    public void run()
{
    for(char ch='A';ch<'E';ch++)
    {
        System.out.println("Letter :"+ch);
    }
}
}
class CreatingThread
{
    public static void main(String gg[])
    {
       NumberThread nt=new NumberThread();
          nt.start();
          LetterThread lt=new LetterThread();
          lt.start();
    }
}