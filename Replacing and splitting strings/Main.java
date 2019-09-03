import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
      String s2=sc.nextLine();
     int n=sc.nextInt();
       String []a = s2.split(" ", n);
      for(int i=0;i<n;i++)
      System.out.println(a[i]);
      }
    }
