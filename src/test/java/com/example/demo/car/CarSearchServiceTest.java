package com.example.demo.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.awt.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;

public class CarSearchServiceTest
{
    @InjectMocks
    private CarSearchService carSearchService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void should_return_no_sport_cars_when_only_one_non_sport_car_was_added() {
        Car nonSportCar = new CarImpl(new Engine(2), Color.BLACK, new Manufacturer("Lada"));
        carSearchService.addCar(nonSportCar);
        assertThat(carSearchService.findSportCars(), empty());
    }

    @Test
    public void should_return_two_sports_cars_which_were_added() {
        Car nonSportCar = new CarImpl(new Engine(2), Color.BLACK, new Manufacturer("Lada"));
        Car sportCar01 = new CarImpl(new Engine(7), Color.RED, new Manufacturer("Ferrari"));
        Car sportCar02 = new CarImpl(new Engine(9), Color.RED, new Manufacturer("Ferrari"));

        carSearchService.addCar(nonSportCar);
        carSearchService.addCar(sportCar01);
        carSearchService.addCar(sportCar02);
        var list = carSearchService.findSportCars();

        assertThat(list, hasSize(2));
        assertThat(list, contains(sportCar01, sportCar02));
    }

}
