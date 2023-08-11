package DayFive;

import org.junit.Test;
import static org.junit.Assert.*; 	
public class TestMathOperation {

	@Test
	public void testAddfunction() {
		MathOperation mop=new MathOperation();
		int res=mop.add(2, 3);
		assertEquals(5,res);
		/*if(res==5)
		System.out.println("Result Passed");
		else
		System.out.println("Result failed");*/
	}

}
