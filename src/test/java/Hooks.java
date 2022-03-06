import common.CommonLibrary;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonLibrary {
    @Before
    public void beforeMethod() {
     openBrowser();
    }
    @After
    public void afterMethod(){
      closeBrowser();
    }
}
