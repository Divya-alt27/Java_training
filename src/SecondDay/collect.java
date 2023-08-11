package SecondDay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aList=new ArrayList<Integer>();
		aList.add(5);
		aList.add(10);
		aList.add(15);
		System.out.println(aList);
		aList.remove(1);
		System.out.println(aList);
		aList.add(0,20);
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
		for(int i=0;i<aList.size();i++)
			System.out.println(aList.get(i));
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("The input is "+s1);

	}

}
