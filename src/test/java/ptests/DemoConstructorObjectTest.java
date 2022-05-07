package ptests;

import org.junit.Assert;
import org.junit.Test;
import people.DemoConstructorObject;

public class DemoConstructorObjectTest {

    DemoConstructorObject dm = new DemoConstructorObject("Masha", "Petrova", "fame", "manager", 30, 2000.2);


    @Test
    public void generateNewTest() {

        Assert.assertEquals("   ", "Masha", dm.getName());
        Assert.assertEquals("   ", "Petrova", dm.getSurname());
        Assert.assertEquals("   ", "fame", dm.getSex());
        Assert.assertEquals("   ", "manager", dm.getJobTitle());
        Assert.assertEquals("   ", 30, dm.getAge());
        Assert.assertEquals("   ", 2000.2, dm.getSalary(),0.1);
    }

    @Test
    public void generateNewTest1() {
        Assert.assertEquals("   ", "Masha", dm.getName());
    }
    @Test
    public void generateNewTest2() {
        Assert.assertEquals("   ", "Petrova", dm.getSurname());

    }

    @Test
    public void generateNewTest3() {
        Assert.assertEquals("   ", "fame", dm.getSex());

    }

    @Test
    public void generateNewTest4() {
        Assert.assertEquals("   ", "manager", dm.getJobTitle());
         }

    @Test
    public void generateNewTest5() {
        Assert.assertEquals("   ", 30, dm.getAge());

    }
    @Test
    public void generateNewTest6() {
        Assert.assertEquals("   ", 2000.2, dm.getSalary(),0.1);
    }

}
