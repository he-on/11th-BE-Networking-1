package car;

public class Car {

    private final String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    //이동 메서드
    public void move(){
        position++;
    }
    public String getName() {
        return name;
    }

    public int getPosition(){
        return position;
    }
}
