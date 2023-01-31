package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDaoImpl implements CarsDao {
    private static int CARS_COUNT;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Model1", 100, "white"));
        cars.add(new Car(++CARS_COUNT, "Model2", 200, "black"));
        cars.add(new Car(++CARS_COUNT, "Model3", 300, "blue"));
        cars.add(new Car(++CARS_COUNT, "Model4", 400, "gray"));
        cars.add(new Car(++CARS_COUNT, "Model5", 500, "yellow"));
        cars.add(new Car(++CARS_COUNT, "Model6", 600, "green"));
    }


    @Override
    public void saveCar(int id, String model, int series, String color) {

        cars.add(new Car(id, model, series, color));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
