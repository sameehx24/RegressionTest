package org.parallelExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ClassLevel3 {
	

	@Test
	public void test7() {
		System.out.println("test 7  "+ Thread.currentThread().getId());
	}
	@Test
	public void test8() {
		System.out.println("test 8  "+ Thread.currentThread().getId());
	}
	@Test
	public void test9() {
		System.out.println("test 9   "+ Thread.currentThread().getId());
	}

}
