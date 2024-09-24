package Facade;

import Concrete.AirConditioning;
import Concrete.Light;
import Concrete.TV;
import Interface.HomeService;

public class HomeInterface {
    AirConditioning ac;
    Light light;
    TV tv;

    public HomeInterface() {
        this.ac = new AirConditioning();
        this.light = new Light();
        this.tv = new TV();
    }


    public void turnOnAll () {
        ac.turnOn();
        light.turnOn();
        tv.turnOn();
    }

    public void turnOffAll () {
        ac.turnOff();
        light.turnOff();
        tv.turnOff();
    }
}
