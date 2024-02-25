import org.junit.Test;

import java.sql.Connection;

public class MyConnectionTest {

    @Test(timeout = 1000)
    public void connectionShouldBeFasterThanOneSecond(){
        MyConnection connection = new MyConnection();
        connection.doConnection();
    }
}
