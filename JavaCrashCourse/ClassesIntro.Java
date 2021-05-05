package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Jerry");
        Car anotherCar = new Car("Doug");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();
        anotherCar.brake();
        myCar.primus();
    }
}
class Car {

    private int speed = 0;
    private String name;
    //constructor
    public Car(String carName) {
        name = carName;
    }

    public void accelerate() {
        speed++;
//        System.out.printf("Vroom. %s is going %d miles per hour.%n", name, speed);
        showSpeed();
    }

    public void brake() {
        if(speed != 0) {
            speed--;
        }

        showSpeed();
    }

    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed);
    }

    public void primus() {
        System.out.printf("%s was a Racecar Driver, drove so goddamn fast.%n", name);
        System.out.println("Never did get that checkered flag, but he never did come in last");
    }
}
