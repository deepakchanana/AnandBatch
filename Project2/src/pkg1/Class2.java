package pkg1;

public class Class2 extends Class1
{
   public void arithmetic(int a,int b)
   {
	   int c;
	   c=a-b;
	   System.out.println("Result is "+c);
   }
   public static void main(String[] args) 
   {
	Class2 obj=new Class2();
	obj.arithmetic(11, 2);
   }
}
