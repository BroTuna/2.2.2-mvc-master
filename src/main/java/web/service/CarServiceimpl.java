package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceimpl implements CarService {

    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(++idCars, "VOLVO", "xc60", 2016));
        carList.add(new Car(++idCars, "KIA", "Rio", 2016));
        carList.add(new Car(++idCars, "PEJO", "JO", 2022));
        carList.add(new Car(++idCars, "LADA", "Granta", 2012));
        carList.add(new Car(++idCars, "HONDA", "Civic", 2010));
    }
    private static int idCars;
    @Override
    public List<Car> getCarsId(Integer count) {
        List<Car> cars = new ArrayList<>();

        if (count == null || count >= 5) {
            return carList;
        } else {
            for (int i = 1; i <= count; i++) {
                cars.add(carList.get(i));
            }
            return cars;
        }
    }
}
