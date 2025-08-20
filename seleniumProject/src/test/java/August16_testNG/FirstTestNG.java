package August16_testNG;

import org.testng.annotations.Test;   // ✔ Correct for TestNG


public class FirstTestNG {
@Test 
public void Login() {
	System.out.println("Logined SuccessFully");
}
@Test 
public void Logout() {
	System.out.println("Logout SuccessFully");
}
}
