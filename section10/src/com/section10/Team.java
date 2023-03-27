package com.section10;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private final String teamName;
    private final ArrayList<T> players = new ArrayList<>();

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(T player) {
        if(!players.contains(player)) {
            players.add(player);
        }
        System.out.println(player.getName() + " is already on the team!");
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    public void matchResult(Team<T> opponent, int teamScore, int opponentScore) {
        getScoreValues(teamScore, opponentScore);
        played++;
        if(opponent != null) {
            opponent.matchResult(null, opponentScore, teamScore);
        }
    }

    public void getScoreValues(int teamScore, int opponentScore) {
        if(teamScore > opponentScore) {
            this.won++;
            return;
        }
         if(teamScore == opponentScore) {
            this.tied++;
            return;
        }
        this.lost++;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            System.out.println("In the lead");
            return 1;
        }
        if(this.ranking() < team.ranking()) {
            System.out.println("Not in the lead");
            return -1;
        }
        System.out.println("Tied");
        return 0;
    }
}
