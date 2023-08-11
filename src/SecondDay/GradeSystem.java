package SecondDay;

public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark=70;
		mark=mark/10;
		switch(mark)
		{
		case 10:System.out.println("Student passed with centum");
		break;
		case 9:System.out.println("Student passed with GRADE A");
		break;
		case 8: System.out.println("Student passed with Grade B");
		break;
		default:
			System.out.println("Stuudent failed with poor marks");
		
		}

	}

}
