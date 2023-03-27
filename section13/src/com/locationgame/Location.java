package com.locationgame;

import java.util.*;

public final class Location {
  private final int locationID;
  private final String description;
  private final Map<String, Integer> exits;

  public Location(int locationID, String description, Map<String, Integer> exits) {
    this.locationID = locationID;
    this.description = description;

    if (exits == null) {
      this.exits = new HashMap<String, Integer>();
    } else {
      this.exits = new HashMap<String, Integer>(exits);
    }

    this.exits.put("Q", 0);
  }

  public Map<String, Integer> getExits() {
    return new HashMap<String, Integer>(this.exits);
  }

  public String getDescription() {
    return this.description;
  }

  public int getLocationID() {
    return this.locationID;
  }

}
