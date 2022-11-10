import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Fiat", 120, 45000, 3));
        cars.add(new Car("Porsche", 300, 250000, 8));
        cars.add(new Car("Mercedes", 280, 200000, 7));
        cars.add(new Car("Ford", 220, 120000, 5));
        cars.add(new Car("Kia", 200, 80000, 4));

        Map<String, Car> carMap = cars.stream().
                collect(Collectors.toMap(car -> car.name, car -> car));
        System.out.println(carMap);
        System.out.println("//////////////////////////////////");
        Car car1 = carMap.get("Fiat");
        System.out.println(car1);
    }
}
