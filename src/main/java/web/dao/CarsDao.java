package web.dao;

import web.model.Car;

import java.util.List;

public interface CarsDao {
    void saveCar (int id, String model, int series, String color);
    List<Car> getAllCars();
}
