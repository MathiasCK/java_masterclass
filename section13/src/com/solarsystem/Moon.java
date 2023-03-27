package com.solarsystem;

import com.solarsystem.HeavenlyBody;

public class Moon extends HeavenlyBody {

  public Moon(String name, double orbitalPeriod) {
    super(name, (int) orbitalPeriod, BodyTypes.MOON);
  }
}
