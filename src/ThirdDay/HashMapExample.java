package ThirdDay;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> student =new HashMap<Integer,String>();
		student.put(1,"first");
		student.put(2,"first");
		student.put(2,"second");
		student.put(3,"second");
		student.put(4,"third");
		student.put(5,"failed");
		student.put(6,"failed");
		System.out.println(student);
		System.out.println(student.get(2));
		Set<Integer> roll=student.keySet();
		for(int i:roll)
		{
			System.out.print("key is "+i);
			System.out.println(" and value is "+student.get(i));
		}
		Iterator<Integer> iter=roll.iterator();
		while(iter.hasNext())
		{
			//System.out.print("Key is"+);
		}
		}
	}

