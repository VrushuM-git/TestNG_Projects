package Groups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassC {
	@Test
	public void PersonalLoanA()
	{
		System.out.println("approved personal loan_A ");
	}
	
	@Test
	public void PersonalLoan_carB()
	{
		System.out.println("approved car loan_B");
	}
	
	@Test(groups={"smokeTest"})
	public void PersonalLoan_homeC()
	{
		System.out.println("approved  home loan_C");
	}
	
}
