package main.java.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kannan on 10/25/2018.
 */
public class VehicleFactory {

    private static Map<String, Vehicle> map = new HashMap();

    public Vehicle getVehicle(String type)
    {
        Vehicle vehicle;
        if("Ritz".equalsIgnoreCase(type))
        {
            vehicle=new RitzCar();
        }
        if("Swift".equalsIgnoreCase(type))
        {
            vehicle=new SwiftCar();
        }

        return map.putIfAbsent(type, vehicle);
    }
}
