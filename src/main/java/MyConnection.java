public class MyConnection {
    public void doConnection(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connect!!!");
    }
}
