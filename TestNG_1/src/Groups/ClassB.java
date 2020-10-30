package Groups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassB {
	@Test
	public void PersonalLoan1()
	{
		System.out.println("approved personal loan1");
	}

	@Test(groups={"smokeTest"})
	public void PersonalLoan_car2()
	{
		System.out.println("approved car2 loan");
	}

	@Test(groups={"Regression"})
	public void PersonalLoan_home3()
	{
		System.out.println("approved  home3 loan");
	}

}
