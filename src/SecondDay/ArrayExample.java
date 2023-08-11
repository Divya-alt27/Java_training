package SecondDay;

public class ArrayExample {

	public static void main(String[] args) {
		int roll_number[]=new int[10];
		int myarray[]= {3,6,3,1,6,3};
		
		for(int num=1;num<=20;num++) {
			System.out.println(num);
		}
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
		int i=0;
		while(i<myarray.length)
		{
			System.out.println(myarray[i]);
			i++;
		}
	}

}
