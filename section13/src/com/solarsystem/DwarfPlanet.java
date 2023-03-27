package com.solarsystem;

import com.solarsystem.HeavenlyBody;

public class DwarfPlanet extends HeavenlyBody {
  public DwarfPlanet(String name, int orbitalPeriod) {
    super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
  }

}
