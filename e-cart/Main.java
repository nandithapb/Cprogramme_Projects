//package myproject;
import java.util.*;

class Item
{
  private int price;
  public int getPrice() 
  {
	return price;
  }

 public void setPrice(int price)
 {
	this.price = price;
 }

}
   
class Customer
{
  private String product;
  private int quantity;

  public String getProduct() 
  {
	return product;
  }
  public void setProduct(String product) 
  {
	this.product = product;
  }

  public int getQuantity() 
  {
	return quantity;
  }
public void setQuantity(int quantity) 
  {
	this.quantity = quantity;
  }
  //create various method to return attribute value(s)
}

class Bill 
{
	int tot;
	
  public Bill(int a,int b)
  {
	  System.out.println("Total Price is : "+a*b);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Scanner sc = new Scanner(System.in);
    String it = sc.nextLine();
    int p = sc.nextInt();
    int q = sc.nextInt();
    i.setPrice(p);
    c.setProduct(it);
    c.setQuantity(q);
    Bill obj = new Bill(i.getPrice(),c.getQuantity());
    
    
  }
}