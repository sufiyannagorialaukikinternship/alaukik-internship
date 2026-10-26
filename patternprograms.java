class patternprograms
{
  public static void  main(String gg[])
{
    printStar p=new printStar();
    p.printStar(10);
}
}
class printStar
{
    private int star;
  public void printStar(int steps)
  {
star=1;
    for(int i=0;i<steps;i++)
    {
        for(int j=0;j<star;j++) System.out.print("*");
    System.out.print("\n");
           star++;
    }
  }
}