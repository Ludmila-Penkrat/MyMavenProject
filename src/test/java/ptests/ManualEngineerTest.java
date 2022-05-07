package ptests;

import org.junit.Assert;
import org.junit.Test;
import people.ManualEngineer;
import people.Person;

public class ManualEngineerTest {

    ManualEngineer manualEngineer = new ManualEngineer(25,3);

    @Test
    public void apersonAgeDefaultTest() {
        Assert.assertEquals("Manual Engineer age is not correct", 25, manualEngineer.getAge());
    }

    @Test
    public void bpersonSkillDefaultTest() {
        Assert.assertEquals("Manual Engineer skill is not correct", 6, manualEngineer.getSkill());
    }

    @Test
    public void cpersonExperienceDefaultTest(){
        Assert.assertEquals("Manual Engineer experience is not correct",3,manualEngineer.getExperience());

    }

    @Test
    public void dpersonAgeTest(){
        manualEngineer.setAge(25);
        Assert.assertEquals("Manual Engineer age setter is not correct", 25, manualEngineer.getAge());
    }

    @Test
    public void epersonSkillTest() {
        manualEngineer.setSkill(6);
        Assert.assertEquals("Manual Engineer skill setter is not correct", 6, manualEngineer.getSkill());
    }


    @Test
    public void fpersonExperienceTest(){
        manualEngineer.setExperience(3);
        Assert.assertEquals("Manual Engineer experience setter is not correct",3,manualEngineer.getExperience());

    }
}
