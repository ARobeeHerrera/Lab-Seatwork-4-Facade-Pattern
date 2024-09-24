package Concrete;

import Interface.HomeService;

public class Light implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Lights is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lights is off");
    }
}
