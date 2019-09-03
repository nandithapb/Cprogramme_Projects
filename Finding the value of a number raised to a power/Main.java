import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int ex=sc.nextInt();
      int pow=1;
      for(int i=ex;i>=1;i--)
      {
        pow=pow*base;
      }
      System.out.println(pow);
    }
}