package com.W4;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets = new ArrayList<Planet>();
    public void addPlanet(Planet planet) {
        planets.add(planet);
    }
    public void printAllPlanets(){
        for(Planet planet: planets){
            System.out.println(planet);
        }
    }
    public int getPlanetCount(){
        return planets.size();
    }

    public static void main(String[] args) {
        Planet mercury = new Mercury();
        Planet venus = new Venus();
        Planet earth = new Earth();
        Planet saturn = new Saturn();

        SolarSystem solarsystem = new SolarSystem();
        solarsystem.addPlanet(mercury);
        solarsystem.addPlanet(venus);
        solarsystem.addPlanet(earth);
        solarsystem.addPlanet(saturn);

        solarsystem.printAllPlanets();
        System.out.println(solarsystem.getPlanetCount());

    }
}
