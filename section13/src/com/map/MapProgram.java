package com.map;

import java.util.Map;
import java.util.HashMap;

public class MapProgram {

  public static void main(String[] args) {
    Map<String, String> languages = new HashMap<>();

    languages.put("Java", "a compiled high level, object-oriented plantform independent language");

    languages.put("Python", "an interpreted, object oriented, high lebel programing language with dynamic sematics");

    languages.put("Algol", "an algorithmic language");

    languages.put("BASIC", "Beginners all purposes symbolic instruction code");

    languages.put("Lisp", "Therein lies madness");

    if (languages.containsKey("Java")) {
      System.out.println("Java is already in the map");
    } else {
      languages.put("Java", "This course is about Java");
    }

    for (String key : languages.keySet()) {
      System.out.println("Key: " + languages.get(key));
    }

    // languages.remove("Lisp");

    if (languages.remove("Algol", "an algorithmic language")) {
      System.out.println("Algol removed");
    } else {
      System.out.println("Algol not removed, key value pair not found");
    }
    if (languages.replace("Lisp", "Therein lies madness", "New lisp entry")) {
      System.out.println("Lisp replaced");
    } else {
      System.out.println("Lisp was not replaced");
    }

    languages.replace("Scala", "this will not be added");

  }
}
