package com.company.javaAdvenced.generics.nonGeneric;

import com.company.javaAdvenced.generics.FootballTeam;
import com.company.javaAdvenced.generics.Team;
import com.company.javaAdvenced.generics.TeamLevel;
import com.company.javaAdvenced.generics.VolleyBallTeam;

public class LeagueMain {

    public static void main(String[] args) {

        League league = new League("Primiera Division");

        Team team1 = new FootballTeam("FC Barcelona", TeamLevel.PROFESSIONAL);
        Team team2 = new FootballTeam("Real Madrit CF", TeamLevel.PROFESSIONAL);
        Team team3 = new FootballTeam("Valencia CF", TeamLevel.PROFESSIONAL);
        Team team4 = new FootballTeam("Atletico Madrit", TeamLevel.PROFESSIONAL);

        team1.setPoints(30);
        team2.setPoints(10);
        team3.setPoints(20);
        team4.setPoints(28);

        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.addTeam(team4);
        league.printTable();

        Team team5 = new VolleyBallTeam("Asseco Resovia", TeamLevel.PROFESSIONAL);
        team5.setPoints(18);
        league.addTeam(team5);
        System.out.println("========");
        league.printTable();
    }
}
