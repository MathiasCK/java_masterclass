package com.section10;

import java.util.ArrayList;
import java.util.Collections;

public class League<L extends Team> implements ILeague<L> {

    private final String name;
    private final ArrayList<L> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }
    public void addTeam(L team) {
        teams.add(team);
    }

    public void printTeamsInOrder() {
        Collections.sort(teams);
        teams.forEach(team -> System.out.println(team.getTeamName() + " ranking : " + team.ranking()));
    }



    public static void main(String[] args) {
        League<Team<BaseballPlayer>> baseballPlayerLeague = new League<>("Baseball league");

        Team<BaseballPlayer> baseballPlayerTeam1 = new Team<>("Baseball team1");
        Team<BaseballPlayer> baseballPlayerTeam2 = new Team<>("Baseball team2");

        baseballPlayerLeague.addTeam(baseballPlayerTeam1);
        baseballPlayerLeague.addTeam(baseballPlayerTeam2);

        baseballPlayerTeam1.matchResult(baseballPlayerTeam2, 1, 2);
        baseballPlayerTeam1.matchResult(baseballPlayerTeam2, 3, 4);
        baseballPlayerTeam1.matchResult(baseballPlayerTeam2, 10, 7);
        baseballPlayerTeam1.matchResult(baseballPlayerTeam2, 2, 3);

        baseballPlayerLeague.printTeamsInOrder();
    }

}
