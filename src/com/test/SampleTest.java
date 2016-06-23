package com.test;
import org.testng.annotations.*;

public class SampleTest {
 
 @BeforeClass
 public void setUp() {
   // code that will be invoked when this test is instantiated
 }
 
 @Test(groups = { "sanity" })
 public void aFastTest() {
   System.out.println("Fast test");
 }
 
 @Test(groups = { "smoke" })
 public void aSlowTest() {
    System.out.println("Slow test");
 }
 @Test(groups = { "sanity" })
 public void aFastTest1() {
   System.out.println("Fast test");
 }
 @Test(groups = { "s" })
 public void aFastTest2() {
   System.out.println("Fast test");
 }
 
}

