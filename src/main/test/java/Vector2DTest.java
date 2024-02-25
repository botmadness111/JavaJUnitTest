import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D vector = new Vector2D();

        Assert.assertEquals(0, vector.getLength(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D vector = new Vector2D();

        Assert.assertEquals(0, vector.getX(), 0);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D vector = new Vector2D();

        Assert.assertEquals(0, vector.getY(), 0);
    }
}
