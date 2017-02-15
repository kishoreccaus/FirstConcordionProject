
package specs.FirstConcordionTest;


import com.FirstConcordionTest.SystemTest;


import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)

public class SystemFixture {

   SystemTest tsystem = new SystemTest();
	
   public String getGreeting(String userName1){
      return tsystem.getGreeting(userName1);
   }
   
}