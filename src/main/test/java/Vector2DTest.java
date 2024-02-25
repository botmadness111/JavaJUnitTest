import org.junit.*;

public class Vector2DTest {
    private static Vector2D vector;

    @BeforeClass
    public static void createNewVector() {
        System.out.println("Hello class!");
        vector = new Vector2D();
    }

    @Before
    public void beforeMethod(){
        System.out.println("Hello method!");
    }

    @After
    public void afterMethod(){
        System.out.println("Goodbye method!");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Goodbye class!");
    }

    @Test
    public void newVectorShouldHaveZeroLength() {

        Assert.assertEquals(0, vector.getLength(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {

        Assert.assertEquals(0, vector.getX(), 0);
    }

    @Test
    public void newVectorShouldHaveZeroY() {

        Assert.assertEquals(0, vector.getY(), 0);
    }
}
