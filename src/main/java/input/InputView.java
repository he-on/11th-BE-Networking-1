package input;

import camp.nextstep.edu.missionutils.Console;
import car.CarFactory;

public class InputView {
    public String[] inputCarNames(){
        System.out.println("자동차 이름을 입력하세요. 5자 이내여야 하며 구분은 쉼표(,)로 합니다");
        String input = Console.readLine();
        String[] names = input.split(",");

        CarFactory factory = new CarFactory();
        factory.createCars(names);

        return names;

    }

    public String inputTryCount(){
        System.out.println("경주 시도 횟수를 입력하세요.");
        String count = Console.readLine();

        return count;
    }
}
