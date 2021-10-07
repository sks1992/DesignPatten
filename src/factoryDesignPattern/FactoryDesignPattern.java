package factoryDesignPattern;
//Factory Design Pattern => It is a type of creation design Pattern
//when we use=> It is used when we have multiple sub-classes of a super-class &
// based on input we want to return one class instance
public class FactoryDesignPattern {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car", 9);
        System.out.println(car);

        Vehicle bike = VehicleFactory.getInstance("bike", 6);
        System.out.println(bike);
    }
}

abstract class Vehicle {
    public abstract int getWheel();

    public String toString() {
        return "Wheel: " + this.getWheel();
    }
}
//car and bike is sub-class of vehicle
class Car extends Vehicle {
    int wheel;

    Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

class Bike extends Vehicle {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }
}

//we create a factory method  so that we can access the sub-class instance
// by input we don't need to create an instance for subclass
class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if(type == "car") {
            return new Car(wheel);
        } else if(type == "bike") {
            return new Bike(wheel);
        }

        return null;
    }
}