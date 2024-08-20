package inheritance;
class One
{
	static void add()
	{
		System.out.println("1");
	}
}
class Two extends One
{
	static void sub()
	{
		System.out.println("2");
	}
	
}
public class MulitInheri extends Two
{
	static void mul()
	{
		System.out.println("3");
	}
public static void main(String[] args) 
{
	add();
	sub();
	mul();
}
}
