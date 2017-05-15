/**
 * Created @2017/5/13 17:12
 */
public class TestCar {
    public static void main(String[] arg) {
        AoTo aoto1 = new AoTo(4, "black", 300.5f , 215.3f);
        AoTo aoTo2 = new AoTo("red", 400.6f);
        AoTo aoto3 = new Car(3, "wirte", 500.5f);
        Car car = new Car(2, "yellow", 100.5f);

        aoto1.speedDown(10);
        aoto3.speedUp(10);
        car.stop();
        System.out.println("aoto1" + " "  + aoto1.toString());
        System.out.println("aoto2" + " "  + aoTo2.toString());
        System.out.println("aoto3" + " "  + aoto3.toString());
        System.out.println("car" + " "  + car.toString());

    }
}
