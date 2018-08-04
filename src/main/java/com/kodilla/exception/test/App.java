package com.kodilla.exception.test;

public class App {
    public static void main(String[] args) {
        Flight warLon = new Flight("WARSAW", "LONDON");
        Flight romPar = new Flight("ROME", "PARIS");
        Flight lonNYC = new Flight("LONDON", "NEW YORK");
        Flight berLon = new Flight("BERLIN", "LONDON");

        LogicOfApp searchFlight = new LogicOfApp();

        try{
            boolean existingFlightWarLon = searchFlight.findFlight(warLon);
            System.out.println("Flight from Warsaw to London " + existingFlightWarLon);
        } catch (RouteNotFoundException e){
            System.out.println("No such airport exist");
        }

        try{
            boolean existingFlightRomPar = searchFlight.findFlight(romPar);
            System.out.println("Flight from Rome to Paris " + existingFlightRomPar);
        } catch (RouteNotFoundException e){
            System.out.println("No such airport exist");
        }

        try{
            boolean existingFlightLonNYC = searchFlight.findFlight(lonNYC);
            System.out.println("Flight from London to New York " + existingFlightLonNYC);
        } catch (RouteNotFoundException e){
            System.out.println("No such airport exist");
        }

        try{
            boolean existingFlightBerLon = searchFlight.findFlight(berLon);
            System.out.println("Flight from Berlin to London " + existingFlightBerLon);
        } catch (RouteNotFoundException e){
            System.out.println("No such airport exist");
        }
    }
}
