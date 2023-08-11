package firstDay;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Test t = new Test();
		t.add(8, 2);
		t.sub(8, 2);
	}

}
class Test
{
	int x,y;
	void add(int x,int y)
	{
	System.out.println(x+y);
	}
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	
	
	
}
