package web.service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car("BMW", "white", 2018));
        carsList.add(new Car("Reno", "green", 2015));
        carsList.add(new Car("Citroen", "blue", 2022));
        carsList.add(new Car("Lada", "black", 2014));
        carsList.add(new Car("Audi", "red", 2019));
    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count != 0 && count >= 0 && count <= carsList.size()) {
            return carsList.stream().limit(count).collect(Collectors.toList());
        }
        return carsList;
    }
}
