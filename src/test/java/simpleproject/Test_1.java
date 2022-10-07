package simpleproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_1 {

	public static void verifyLoginWithCredentials() {
		System.out.println("test started");
		Assert.assertTrue(true);
		System.out.println("test ended");
	}
	@Test
	public static void verifyLoginWithInvalidCredentials() {
		System.out.println("test started");
		Assert.assertTrue(true);
		System.out.println("test ended");
	}
	@Test
	public static void verifyLoginWithNoCredentials() {
		System.out.println("test started");
		Assert.assertTrue(true);
		System.out.println("test ended");
		System.out.println("test ended");
	}

}

	

