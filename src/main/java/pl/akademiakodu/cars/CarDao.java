package pl.akademiakodu.cars;

import java.util.List;

public interface CarDao {
    List<Car> findall();
    void addCar(Car car);


}
