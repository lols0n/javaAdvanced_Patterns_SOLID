package com.company.javaAdvenced.generics;

public class VolleyBallTeam extends Team {

    private TeamLevel teamLevel;

    public VolleyBallTeam(String name, TeamLevel teamLevel) {
        super(name);
        this.teamLevel = teamLevel;
    }

    public TeamLevel getTeamLevel() {
        return teamLevel;
    }
}
