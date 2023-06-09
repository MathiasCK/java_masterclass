package com.solarsystem;

import com.solarsystem.HeavenlyBody;

public class Planet extends HeavenlyBody {

  public Planet(String name, double orbitalPeriod) {
    super(name, orbitalPeriod, BodyTypes.PLANET);
  }

  @Override
  public boolean addSatellite(HeavenlyBody moon) {
    if (moon.getBodyType() == BodyTypes.MOON) {
      return super.addSatellite(moon);
    }
    return false;
  }

}
