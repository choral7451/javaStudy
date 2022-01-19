package NewCar.CarContents;
class Accel {

    String name;

    Accel(String carName) {
        this.name = carName;
    }

    void push() {
        System.out.println(String.format("%s가 전진!", name));
    }
}
