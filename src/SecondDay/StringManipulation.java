package SecondDay;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student1="divya";
		String student2="Karthick";
		String student3="divya";
		System.out.println(student1);
		System.out.println(student1.toUpperCase());
		System.out.println(student1.toLowerCase());
		System.out.println(student1.contains("v"));
		System.out.println(student2.charAt(4));
		System.out.println(student2.indexOf("r"));
		System.out.println(student1.concat(student2));
		System.out.println(student1.length());
		System.out.println(student2.substring(3));
		System.out.println(student2.substring(2,5));
		System.out.println(student1.endsWith("a"));
		System.out.println(student1.replace("ya","i"));		
		System.out.println(student1.equals(student3));
		System.out.println("Reversal of string is ");
		for(int i=student1.length()-1;i>=0;i--)
		System.out.print(student1.charAt(i));
		}
	}

