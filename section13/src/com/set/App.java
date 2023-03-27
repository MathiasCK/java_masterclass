package com.set;

import java.util.*;

public class App {

  static Set<Integer> squares = new HashSet<>();
  static Set<Integer> cubes = new HashSet<>();
  static Set<Integer> union = new HashSet<>();
  static Set<Integer> intersection = new HashSet<>();

  static Set<String> nature = new HashSet<>();
  static Set<String> divine = new HashSet<>();

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      squares.add(i * i);
      cubes.add(i * i * i);
    }

    union.addAll(squares);
    union.addAll(cubes);
    System.out.println("Union: " + union.size());

    intersection.addAll(squares);
    intersection.retainAll(cubes);
    System.out.println("Intersection: " + intersection.size());

    for (int i : intersection) {
      System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
    }

    String[] natureWords = { "all", "nature", "is", "but", "art", "unkown", "to", "three" };
    nature.addAll(Arrays.asList(natureWords));

    String[] divineWords = { "to", "err", "is", "human", "to", "forgive", "divine" };
    divine.addAll(Arrays.asList(divineWords));

    System.out.println("nature - divine: ");
    Set<String> diff1 = new HashSet<>(nature);
    diff1.removeAll(divine);
    printSet(diff1);

    System.out.println("divine - nature:");
    Set<String> diff2 = new HashSet<>(divine);
    diff2.removeAll(nature);
    printSet(diff2);

    Set<String> unionTest = new HashSet<>(nature);
    unionTest.addAll(divine);
    Set<String> intersectionTest = new HashSet<>(nature);
    intersectionTest.retainAll(divine);

    System.out.println("Symetric differnce: ");
    unionTest.removeAll(intersectionTest);
    printSet(unionTest);

    if (nature.containsAll(divine)) {
      System.out.println("Divine is a subset of nature");
    }

    if (divine.containsAll(nature)) {
      System.out.println("Nature is a subset of divine");
    }

    if (nature.containsAll(intersectionTest)) {
      System.out.println("Intersection is a subset of nature");
    }
    if (divine.containsAll(intersectionTest)) {
      System.out.println("Intersection is a subset of divine");
    }
  }

  public static <T> void printSet(Set<T> set) {
    System.out.print("\t");
    for (T s : set) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
