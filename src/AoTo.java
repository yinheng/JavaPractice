/**
 * Created @2017/5/13 16:49
 */
public class AoTo {
    int circlie = 4;
    String color;
    float weight;
    float speed = 100;

    public AoTo(int circlie, String color, float weight, float speed) {
        this(color, weight);
        this.circlie = circlie;
        this.speed = speed;
    }

    public AoTo(String color, float weight) {
        this.color = color;
        this.weight = weight;
    }

    public void speedUp(float s) {
        speed = speed + s;
        System.out.println("speed:" + speed);
    }

    public void speedDown(float s) {
        speed = speed - s;
        System.out.println("speed:" + speed);
    }

    public void stop() {
        System.out.println("stop");
    }

    @Override
    public String toString() {
        return "circlie:" + " " + circlie + "color:" + " " + color + " " + "weight" + " " + weight + " " + "speed" + " " + speed;
    }
}
