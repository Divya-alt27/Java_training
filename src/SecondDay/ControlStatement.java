package SecondDay;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23;
		if (num%2==0)
		{
			System.out.println("Number is divisible by 2");
		}
		else if(num%3==0)
		{
		System.out.println("Number is divisible by 3");	
		}
		else if(num%5==0)
		{
		System.out.println("Number is divisible by 5");	
		}
		else
		{
			System.out.println("Number is not divisible by 2 or 3 or 5");
		}
	}

}
