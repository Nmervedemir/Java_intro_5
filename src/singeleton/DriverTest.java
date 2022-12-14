package singeleton;

public class DriverTest {
    public static void main(String[] args) {

        Driver d1 = Driver.getDriver();//an object
        Driver d2 = Driver.getDriver();//same object

        System.out.println(d1);
        System.out.println(d2);
    }
}
