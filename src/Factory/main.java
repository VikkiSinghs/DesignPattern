package Factory;

public class main {
    public static void main(String[] args){
        Factory make=new Factory();
        Vehicle car=make.createVehicle("car");
        car.stop();
        car.start();
        Vehicle bike=make.createVehicle("bike");
        bike.start();
        bike.stop();
    }
}
