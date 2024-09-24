package Concrete;

import Interface.HomeService;

public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Aircon is On");
    }
    @Override
    public void turnOff() {
        System.out.println("Aircon is Off");
    }

}
