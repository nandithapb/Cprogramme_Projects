import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int option=sc.nextInt();
      switch(option)
      {
        case 1:
          {
            int a=sc.nextInt();
            //int b=sc.nextInt();
            int area=a*a;
            System.out.println(area);
            break;
          }
           case 2:
          {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int area=a*b;
            System.out.println(area);
            break;
          }
           case 3:
          {
            int a=sc.nextInt();
            int b=sc.nextInt();
            float area=(1/2.0f)*a*b;
            System.out.println(area);
            break;
          }
           case 4:
          {
            float a=sc.nextInt();
      //int b=sc.nextInt();
           double area=a*(a*3.14);
            System.out.println(area);
            break;
          }
      }
    }
}