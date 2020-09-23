package Test;

class Car {
    String name;
    long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}

public class CarTest {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Mazda");
        //car.setAge(null);

    }
}
