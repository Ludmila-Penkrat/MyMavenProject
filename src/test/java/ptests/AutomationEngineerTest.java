package ptests;

import org.junit.Assert;
import org.junit.Test;
import people.AutomatedEngineer;

public class AutomationEngineerTest {

    AutomatedEngineer au = new AutomatedEngineer(25,3);

    @Test
    public void apersonAgeDefaultTest() {
        Assert.assertEquals("Automation Engineer age is not correct", 25, au.getAge());
    }

    @Test
    public void bpersonSkillDefaultTest() {
        Assert.assertEquals("Automation Engineer skill is not correct", 9, au.getSkill());
    }

    @Test
    public void cpersonExperienceDefaultTest(){
        Assert.assertEquals("Automation Engineer experience is not correct",3,au.getExperience());

    }

    @Test
    public void dpersonAgeTest(){
        au.setAge(25);
        Assert.assertEquals("Automation Engineer age setter is not correct", 25, au.getAge());
    }

    @Test
    public void epersonSkillTest() {
        au.setSkill(9);
        Assert.assertEquals("Automation Engineer skill setter is not correct", 9, au.getSkill());
    }

    @Test
    public void fpersonExperienceTest(){
        au.setExperience(3);
        Assert.assertEquals("Automation Engineer experience setter is not correct",3,au.getExperience());

    }
}
