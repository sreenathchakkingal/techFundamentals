package main.java.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kannan on 10/25/2018.
 */
public class VehicleFactory {

    private static Map<String, Vehicle> map = new HashMap();

    public static Vehicle getVehicle(String type)
    {
        Vehicle vehicle=map.get(type);

        if(vehicle==null)
        {
            if("RITZ".equalsIgnoreCase(type))
            {
                vehicle=new RitzCar();
            }
            if("SWIFT".equalsIgnoreCase(type))
            {
                vehicle=new SwiftCar();
            }
            map.put(type, vehicle);
        }

        return vehicle;
    }

}
