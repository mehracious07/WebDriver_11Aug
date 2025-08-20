package August19_testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners  implements ITestListener {
	 
		
    public void onFinish(ITestContext arg0) {					
 
	 System.out.println("The testcase execution is completed using selenium testng  ");
    }		
 
 
  	
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
 
    	 System.out.println("The testcase execution is completed with few issues using selenium testng ");
    }		
 
    	
    public void onTestFailure(ITestResult arg0) {	
    	 System.out.println("The testcase execution is failed  using selenium testng");
    }		
	
    public void onTestSkipped(ITestResult arg0) {					
    	 System.out.println("The testcase execution is skipped  using selenium testng");	
    }		
 
    	
    public void onTestStart(ITestResult arg0) {					
    	 System.out.println("The testcase execution is started using selenium testng");
    }		
 
 		
    public void onTestSuccess(ITestResult arg0) {	
    	 System.out.println("The testcase execution is completed successfully using selenium testng");
    }		
 
 
}