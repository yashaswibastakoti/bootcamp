package JavaOOP;

public class Polymorphism {
    public static void main(String[] args){

        VehicleEg vehicle = new VehicleEg();
        vehicle.move();
        VehicleEg vehicle1 = new Car();
        vehicle1.move();
        VehicleEg vehicle2 = new Motorcycle();
        vehicle2.move();
    }
}
class VehicleEg{
    void move(){
        System.out.println("the vehicle is moving.");
    }
}
class Car extends VehicleEg{
    @Override
    void move() {
        System.out.println("The car is driving on the road");
    }
}
class Motorcycle extends VehicleEg{
    @Override
    void move(){
        System.out.println("The motorcycle is cruising on the highway.");
    }
}
