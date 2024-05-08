package web.dao;


import web.exception.InputDataException;
import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCars(int count) throws InputDataException;


}
