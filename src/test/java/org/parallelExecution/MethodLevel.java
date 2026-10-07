package org.parallelExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MethodLevel {

    @Test
    public void test1() {
        System.out.println("Test 1 - " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("Test 2 - " + Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.println("Test 3 - " + Thread.currentThread().getId());
    }

    @Test
    public void test4() {
        System.out.println("Test 4 - " + Thread.currentThread().getId());
    }
}