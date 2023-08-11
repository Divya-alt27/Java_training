package SecondDay;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		int result=1;
		for(int i=1;i<=x;i++)
		{
		result=result*i;
		}
		System.out.println("The factorial is "+result);
		OddEven oe=new OddEven();
		oe.OddEvenfn();

	}

}
class OddEven
{
int odd,even;
	void OddEvenfn()
	{
	int x[]= {3,2,5,7,8,10,17,21,22};
	
	for(int i=0;i<x.length;i++)
	{
		if(x[i]%2==0)
			even+=1;
		else 
			odd+=1;
	}
	System.out.println("Number of even number is "+even);
	System.out.println("Number of odd number is " +odd);
	}
}
