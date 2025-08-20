package LabSession_August19;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lab_Listners implements ITestListener {

	public void onTestStart(ITestResult result) {
	  System.out.println("Test Started");
	}
	public void onTestSuccess(ITestResult result) {
		  System.out.println("Test SucessFull ");
		}
	public void onTestFailure(ITestResult result) {
		  System.out.println("Test Failed");
		}
	
}
