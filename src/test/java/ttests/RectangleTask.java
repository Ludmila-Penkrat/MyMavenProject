package ttests;

import org.junit.Assert;
import org.junit.Test;
import task1.Rectangle;

public class RectangleTask {

    Rectangle rectangle = new Rectangle(2.5, 3.5);

    @Test
    public void doGetLength() {
        Assert.assertEquals("Length is not correct", 2.5, rectangle.getLength(), 0.1);
    }

    @Test
    public void doGetWidth() {
        Assert.assertEquals("Width is not correct", 3.5, rectangle.getWidth(), 0.1);
    }

    @Test
    public void doSetLength() {
        rectangle.setLength(2.5);
        Assert.assertEquals("Length doesn't set correct", 2.5, rectangle.getLength(), 0.1);
    }

    @Test
    public void doSetWidth() {
        rectangle.setWidth(3.5);
        Assert.assertEquals("Wight doesn't set correct", 3.5, rectangle.getWidth(), 0.1);
    }

    @Test
    public void doGetArea() {
        Assert.assertEquals("Get Area is not correct", 8.75, rectangle.getArea(), 0.1);
    }


}
