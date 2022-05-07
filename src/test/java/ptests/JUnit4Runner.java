package ptests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import people.ManualEngineer;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomationEngineerTest.class,
        ManualEngineerTest.class
})
public class JUnit4Runner {


}
