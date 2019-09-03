import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int i,j,k;
      for(i=0;i<r;i++)
      {
        for(j=0;j<i;j++)
        {
          System.out.print(r-j);
        }
        for(k=i+1;k<=r;k++)
        {
          System.out.print(r-i);
        }
        System.out.print("\n");
      }
    }
}