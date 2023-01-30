package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
public interface CarsService {
    void saveCar(int id, String model, int series, String color);
    List<Car> getAllCars(String count);
}
