package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2011, "BMW M5", "black"));
        cars.add(new Car(2016, "Chery Tiggo", "white"));
        cars.add(new Car(2018, "Audi A7", "green"));
        cars.add(new Car(2019, "Tesla Semi", "orange"));
        cars.add(new Car(2021, "Toyota Land Cruiser", "grey"));

        return cars;
    }
}
