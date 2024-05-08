package web.service;


import web.exception.InputDataException;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count) throws InputDataException;
}
