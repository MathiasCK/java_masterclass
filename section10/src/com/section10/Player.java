package com.section10;

public abstract class Player {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Team<FootballPlayer> footballTeam1 = new Team<>("footballTeam1");
        footballTeam1.addPlayer(new FootballPlayer("Joe"));

        Team<FootballPlayer> footBallTeam2 = new Team<>("footBallTeam2");
        footBallTeam2.addPlayer(new FootballPlayer("Pat"));

        footballTeam1.matchResult(footBallTeam2, 3, 2);
        System.out.println(footballTeam1.compareTo(footBallTeam2));

    }
}
