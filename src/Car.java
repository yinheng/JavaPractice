/**
 * Created @2017/5/13 17:02
 */
public class Car extends AoTo{

    String kongtiao;
    String CD;

    public Car(int circlie, String color, float weight) {
      super(color, weight);
      this.circlie = circlie;
    }
    @Override
    public void speedUp(float s) {
        speed = speed + 2 * s;
        System.out.println("speed:" + speed);

    }

    public void speedDown(float s) {
        speed = speed - 2 * s;
        System.out.println("speed:" + speed);
    }

}
