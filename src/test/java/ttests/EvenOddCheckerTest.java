package ttests;

import org.junit.Assert;
import org.junit.Test;
import task1.EvenOddChecker;

public class EvenOddCheckerTest {

//    EvenOddChecker eod = new EvenOddChecker();

//    String str = "Enter an Integer number:";
//
//    @Test
//    public void messageCheck(){
//
//        Assert.assertTrue("Error: String is not found " + str + "\n",
//                str.toString().contains(str));
//        return;
//    }


    @Test
    public void evenCheck1 (){
        Assert.assertTrue("Entered number isn't even", EvenOddChecker.check(4));
    }

    @Test
    public void oddCheck (){
        Assert.assertFalse("Entered number isn't odd", EvenOddChecker.check(5));
    }
}
