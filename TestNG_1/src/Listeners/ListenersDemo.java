package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases started and detials"+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases success and detials"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase fail and detials are:"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase skippedand detials are:"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
