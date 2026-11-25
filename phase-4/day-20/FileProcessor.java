import java.util.*;
import java.io.*;
class FileProcessor implements Runnable
{
   File file;
   FileProcessor(File file)
   {
    this.file=file;
   }
   public void run()
{
    try
    {
    Scanner sc=new Scanner(file);
    int lines=0;
    int words=0;
    int characters=0;
    System.out.println("Thread Name is :"+Thread.currentThread().getName()+"  File name is :"+file.getName());
    while(sc.hasNext())
    {
        String line=sc.nextLine();
        characters+=line.length();
        lines++;
        String[] arr=line.split(" ");
        words=arr.length;
    }
    sc.close();
    
    System.out.println("File :"+file.getName());
    System.out.println("Lines :"+lines);
    System.out.println("Words :"+words);
    System.out.println("characters :"+characters);
    }catch(Exception e)
    {}

}
    public static void main(String gg[]) throws Exception
    {
       File folder=new File("input");
       File files[]=folder.listFiles();
       ArrayList<Thread> threads=new ArrayList<>();
       for(File file:files)
       {
        if(file.isFile())
        {
            FileProcessor fp=new FileProcessor(file);
           Thread t=new Thread(fp);
           threads.add(t);
           t.start();            
        }
       }
       for(Thread t:threads)
       {t.join();}
       System.out.println("All Files are processeed");
    }
}
