package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDaoImpl implements CarsDao{
    private final List<Car> cars = new ArrayList<>();


    @Override
    public void saveCar(int id, String model, int series, String color) {
        cars.add(new Car(id, model, series, color));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
