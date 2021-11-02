/**
 *
 * @author Thiwanka
 */
import java.util.HashMap;


public class prac  {
    public static void main(String[] args) {

        Colors colorFactory1 = ColorFactory.getColor("#1234");
        Colors colorFactory2 = ColorFactory.getColor("#56987");
        Colors colorFactory3 = ColorFactory.getColor("#1234");

        NissanCar c = new NissanCar(colorFactory1);
        NissanCar c1 = new NissanCar(colorFactory2);
        NissanCar c2 = new NissanCar(colorFactory3);

        System.out.println(colorFactory1 == colorFactory2);
        System.out.println(colorFactory1 == colorFactory3);

        c.pain();
        c1.pain();
        c2.pain();
    }

}

abstract class Car {
    Colors color;

    public Car(Colors color) {
        this.color = color;
    }
    public abstract void pain();
}

class NissanCar extends Car{

    public NissanCar(Colors color) {
        super(color);
    }

    @Override
    public void pain() {
        String hashCode = color.hashCode;
        System.out.println("Car paint in " + hashCode);
    }
}
class Colors {

 String hashCode;

    public Colors(String hashCode) {
        this.hashCode = hashCode;
    }
}

class ColorFactory{
    private static final HashMap<String, Colors> POOL =new HashMap<>();

    public static Colors getColor(String hashcode) {
        Colors colors = POOL.get(hashcode);
        if (colors == null) {
            colors = new Colors(hashcode);
            POOL.put(hashcode, colors);
        }
        return colors;
    }
}
