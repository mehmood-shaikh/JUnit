import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJunitMessage {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test(expected=ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}