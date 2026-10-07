package org.parallelExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassLevel2 {
	

	@Test
	public void test4() {
		System.out.println("test 4  "+ Thread.currentThread().getId());
	}
	@Test
	public void test5() {
		System.out.println("test 5  "+ Thread.currentThread().getId());
	}
	@Test
	public void test6() {
		System.out.println("test 6   "+ Thread.currentThread().getId());
	}

}
