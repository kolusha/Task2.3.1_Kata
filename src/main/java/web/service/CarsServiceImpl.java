package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImpl implements CarsService {

    private final CarsDao carsDao;

    @Autowired
    public CarsServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public void saveCar(int id, String model, int series, String color) {
        carsDao.saveCar(id, model, series, color);

    }

    @Override
    public List<Car> getAllCars(String count) {
        int carsCount = Integer.parseInt(count);
        if(carsCount > 5 || carsCount == 0) {
            return carsDao.getAllCars();
        } else {
            return carsDao.getAllCars().stream().limit(carsCount).collect(Collectors.toList());
        }
    }
}
