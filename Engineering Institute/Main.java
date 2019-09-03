import java.util.Scanner;

class Faculty
{
	public int amount;
  public void salary()
  {
    System.out.println("Base Salary: "+amount);
  }
}
class CSE extends Faculty
{
	int bonous=3000;
  public void salary()
  {
  int tot= amount+bonous;
    System.out.println("CSE Faculty: "+tot);
  }
}
class IT extends Faculty
{
	int bonous=5000;
  public void salary(int n)
  {
  int tot= n+bonous;
    System.out.println("IT Faculty: "+tot);
  }
}
class ECE extends Faculty
{
	int bonous=4500;
  public void salary(int amount)
  {int tot= amount+bonous;
    System.out.println("ECE Faculty: "+tot);
  }
}

class Main
{
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  Faculty faculty=new Faculty();
	  faculty.amount=n;
	  
	  CSE cse =new CSE();
    cse.amount=n;
	  IT it= new IT();
      ECE obj = new ECE();
    
    faculty.salary();
      cse.salary();
      it.salary(n);
      obj.salary(n);
    
  }
}