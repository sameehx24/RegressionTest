package org.grouping;

import org.testng.annotations.Test;
import org.baseClass.BaseClass;
import org.testng.annotations.Test;

public class Grouping extends BaseClass {
	@Test(groups="sanity")
	public void test1() {
		System.out.println("test 1 sanity ");
	}
	
	@Test(groups= {"regression","smoke"})
	public void test2() {
		System.out.println("test 2 regression ");
	}
	
	@Test(groups="smoke")
	public void test3() {
		System.out.println("test 3 smoke");
	}
	
	@Test(groups="smoke")
	public void test4() {
		System.out.println("test 4 smoke");
	}

}
