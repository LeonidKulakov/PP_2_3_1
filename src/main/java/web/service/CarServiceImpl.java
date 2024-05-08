package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.exception.InputDataException;
import web.model.Car;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;

    @Override
    public List<Car> getCars(int count) throws InputDataException {
        return carDao.getCars(count);
    }
}
