package com.solarsystem;

import java.util.*;

public class App {

  private static final Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();

  private static final Set<HeavenlyBody> planets = new HashSet<>();

  private static final Set<HeavenlyBody> moons = new HashSet<>();

  public static void main(String[] args) {

    HeavenlyBody temp = new Planet("Mercury", 88);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    temp = new Planet("Venus", 225);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    temp = new Planet("Earth", 365);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    HeavenlyBody tempMoon = new Moon("com.solarsystem.Moon", 27);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    temp = new Planet("Mars", 687);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    tempMoon = new Moon("Deimos", 1.3);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    tempMoon = new Moon("Phobos", 0.3);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    temp = new Planet("Jupiter", 4332);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    tempMoon = new Moon("Io", 1.8);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    tempMoon = new Moon("Europa", 3.5);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    tempMoon = new Moon("Ganymede", 7.1);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    tempMoon = new Moon("Callisto", 16.7);
    solarSystem.put(tempMoon.getKey(), tempMoon);
    temp.addSatellite(tempMoon);

    temp = new Planet("Saturn", 10759);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    temp = new Planet("Uranus", 30660);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    temp = new Planet("Neptune", 165);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    temp = new DwarfPlanet("Pluto", 248);
    solarSystem.put(temp.getKey(), temp);
    planets.add(temp);

    System.out.println("Planets");
    for (HeavenlyBody planet : planets) {
      System.out.println("\t" + planet.getName());
    }

    HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Jupiter", HeavenlyBody.BodyTypes.PLANET));

    System.out.println("Moons of " + body.getName());
    for (HeavenlyBody moon : body.getSatellites()) {
      System.out.println("\t" + moon.getName());
    }

    for (HeavenlyBody planet : planets) {
      moons.addAll(planet.getSatellites());
    }

    System.out.println("All moons");
    for (HeavenlyBody moon : moons) {
      System.out.println("\t" + moon.getName());
    }

    HeavenlyBody pluto = new Planet("Pluto", 824);
    planets.add(pluto);

    for (HeavenlyBody planet : planets) {
      System.out.println(planet.toString());
    }

  }

}
