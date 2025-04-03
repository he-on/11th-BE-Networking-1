package racingcar;

import car.Car;
import output.ResultView;
import support.NumberGenerator;
import java.util.List;

public class Race {
    private final List<Car> cars;
    private final NumberGenerator generator;

    public Race(List<Car> cars, NumberGenerator generator) {
        this.cars = cars;
        this.generator = generator;
    }

    public void run(int tryCount){
        for (int i = 0; i < tryCount; i++) {
            moveAllCars();
            ResultView.printRound(cars);
        }
    }

    private void moveAllCars(){
        for (Car car : cars) {
            if (generator.generate() >= 4){
                car.move();
            }
        }
    }
}
