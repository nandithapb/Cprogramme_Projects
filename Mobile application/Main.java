class MyModel1 
{
   int camera;
   String lock;
   int display;
   
}
class MyModel2 extends MyModel1 {
    //write your logic here
}
class MyModel2T extends MyModel2 {
    //write your logic here
}
public class Main 
{
   public static void main(String[] args) 
   {
	   MyModel1 obj1= new MyModel1();
	   MyModel1 obj2=new MyModel2();
	   MyModel2 obj2T=new MyModel2();
	   obj1.camera=2;
	   obj1.display=5;
	   obj2.camera=5;
	   obj2.lock="Fingerprint";
	   obj2.display=obj1.display;
	   obj2T.camera=16;
	   obj2T.lock=obj2.lock;
	   obj2T.display=6;
	   System.out.println("Features of MyModel 1"+"\n"+"Camera mega pixels: "+obj1.camera);
	  System.out.println("Features of MyModel 2"+"\n"+"Camera mega pixels: "+obj2.camera+"\n"+"Lock mechanism: "+obj2.lock+"\n"+"Display size: "+obj2.display);
	   System.out.println("Features of MyModel 2T"+"\n"+"Camera mega pixels: "+obj2T.camera+"\n"+"Lock mechanism: "+obj2T.lock+"\n"+"Display size: "+obj2T.display);
   }
}