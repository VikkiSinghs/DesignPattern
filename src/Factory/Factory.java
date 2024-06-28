package Factory;

interface Vehicle{
    public void start();
    public void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car has started");
    }
    public void stop(){
        System.out.println("Car has stopped");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike has started");
    }
    public void stop(){
        System.out.println("Bike has stopped");
    }
}

class Factory{
    public Vehicle createVehicle(String type){
        if (type.equalsIgnoreCase("car")) {
            return new Car();
    } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }

}