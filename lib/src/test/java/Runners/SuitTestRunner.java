package Runners;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
    RegisterRunner.class,
	LoginRunner.class,
	ToPayRunner.class
   
})
public class SuitTestRunner {

}


