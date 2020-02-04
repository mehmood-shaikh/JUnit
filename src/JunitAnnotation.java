import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {
	
   //execute before class
   @BeforeClass
   public static void beforeClass() {
      System.out.println("in before class");
   }

   //execute after class
   @AfterClass
   public static void  afterClass() {
      System.out.println("in after class");
   }

   
   //execute before test
   @Before
   public void secondMethod() {
      System.out.println("in before");
   }
   @BeforeClass
   public static void firstMethod() {
      System.out.println("in before2");
   }
   //execute after test
   @After
   public void after() {
      System.out.println("in after");
   }
	
   //test case
   @Test
   public void test() {
      System.out.println("in test");
   }
   
   @Test
   public void testb() {
      System.out.println("in test B");
   }
	
   //test case ignore and will not execute
   @Ignore
   public void ignoreTest() {
      System.out.println("in ignore test");
   }
}
