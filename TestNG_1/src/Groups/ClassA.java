package Groups;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassA {
	@Test(groups={"smokeTest"})
	public void PersonalLoan()
	{
		System.out.println("approved personal loan");
	}
	
	@Test(groups={"sanityTest"})
	public void PersonalLoan_car()
	{
		System.out.println("approved car loan");
	}
	
	@Test
	public void PersonalLoan_home()
	{
		System.out.println("approved  home loan");
	}
	
}
