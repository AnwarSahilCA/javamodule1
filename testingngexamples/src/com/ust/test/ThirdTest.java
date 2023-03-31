package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThirdTest {
  @Test(priority=1,description="test description")
  public void f() {
	  
	  System.out.println("from test method f");
  }
  @Test(priority=2)
  public void a(){
System.out.println("from test method a");
}
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforeclass");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from aftercalss");
  }
  
}
