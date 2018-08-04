package com.kodilla.exception.test;

import java.util.Map;
import java.util.HashMap;

public class LogicOfApp {

    private final Map<String, Boolean> airportMap;

    public LogicOfApp() {
        airportMap = airportDataBase();
    }

    // throw an exception if airport does not exist

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airportName) throws RouteNotFoundException{
        if (airportMap.containsKey(airportName)) {
            return airportMap.get(airportName);
        }else{
            throw new RouteNotFoundException("Airport does not exist!");
        }
    }

    private Map<String, Boolean> airportDataBase() {
        // create mock-up airports map
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("BERLIN", true);
        airportDataBase.put("PARIS", true);
        airportDataBase.put("WARSAW", true);
        airportDataBase.put("NEW YORK", false);
        airportDataBase.put("LONDON", true);

        return airportDataBase;
    }
}