package com.solarsystem;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
  private final Key key;
  private final double orbitalPeriod;
  private final Set<HeavenlyBody> satellites;

  public enum BodyTypes {
    STAR,
    PLANET,
    DWARF_PLANET,
    MOON,
    COMET,
    ASTEROID
  }

  public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
    this.key = new Key(name, bodyType);
    this.orbitalPeriod = orbitalPeriod;
    this.satellites = new HashSet<>();
  }

  public boolean addSatellite(HeavenlyBody moon) {
    return this.satellites.add(moon);
  }

  public String getName() {
    return this.key.getName();
  }

  public BodyTypes getBodyType() {
    return this.key.getBodyType();
  }

  public double getOrbitalPeriod() {
    return this.orbitalPeriod;
  }

  public Set<HeavenlyBody> getSatellites() {
    return new HashSet<>(this.satellites);
  }

  public Key getKey() {
    return this.key;
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj instanceof HeavenlyBody) {
      HeavenlyBody theObject = (HeavenlyBody) obj;
      return this.key.equals(theObject.getKey());
    }

    return false;
  }

  @Override
  public final int hashCode() {
    return this.key.hashCode();
  }

  @Override
  public String toString() {
    return this.key.getName() + ": " + this.key.getBodyType() + ", " + this.orbitalPeriod;
  }

  public static Key makeKey(String name, BodyTypes bodyType) {
    return new Key(name, bodyType);
  }

  public static final class Key {
    private final String name;
    private final BodyTypes bodyType;

    private Key(String name, BodyTypes bodyType) {
      this.name = name;
      this.bodyType = bodyType;
    }

    public String getName() {
      return this.name;
    }

    public BodyTypes getBodyType() {
      return this.bodyType;
    }

    @Override
    public String toString() {
      return this.name + ": " + this.bodyType;
    }

    @Override
    public boolean equals(Object obj) {
      Key key = (Key) obj;

      if (this.name.equals(key.getName())) {
        return (this.bodyType == key.bodyType);
      }

      return false;
    }

    @Override
    public int hashCode() {
      return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }
  }

}
