package web.dao;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import web.exception.InputDataException;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Repository
public class CarDaoImpl implements CarDao {
    private static final String NEGATIVE_NUMBER_RECEIVED = "Получено отрицательное число";

    private List<Car> carList;

    {
        carList = new ArrayList<>(Arrays.asList(
                new Car("Ваз 2101", "Красный", 100),
                new Car("Ваз 2102", "Оранжевый", 200),
                new Car("Ваз 2103", "Желтый", 300),
                new Car("Ваз 2104", "Зеленый", 400),
                new Car("Ваз 2105", "Голубой", 500)
        ));
    }

    @Override
    public List<Car> getCars(int count) throws InputDataException {
        if (count == 0 || count >= 5) {
            return carList;
        } else if (count < 0) {
            throw new InputDataException(NEGATIVE_NUMBER_RECEIVED);
        }
        return carList.stream().limit(count).toList();
    }
}
