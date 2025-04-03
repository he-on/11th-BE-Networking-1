package racingcar;

import output.ResultView;
import support.CountValidator;
import support.NameValidator;
import car.CarFactory;
import input.InputView;
import car.Car;
import support.NumberGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        //입력받기
        InputView input = new InputView();
        String[] names = input.inputCarNames();
        String tryCountInput = input.inputTryCount();

        //유효성 검사
        NameValidator nameValidator = new NameValidator();
        for (String name : names) {
            nameValidator.validate(name);
        }

        CountValidator countValidator = new CountValidator();
        countValidator.validate(tryCountInput);
        int tryCount = Integer.parseInt(tryCountInput);


        //자동차 생성
        CarFactory carFactory = new CarFactory();
        List<Car> cars = carFactory.createCars(names);

        //레이스 실행
        NumberGenerator generator = new NumberGenerator();
        Race race = new Race(cars, generator);
        race.run(tryCount);

        //결과값 출력
        List<Car> winners = WinnerFinder.findWinners(cars);
        ResultView.printWinners(winners);

    }
}