package com.company.generics;

import javax.crypto.spec.PSource;
import javax.swing.*;

public class EnumDemo {

    public static void main(String[] args) {

        FootballTeam footballTeam = new FootballTeam("LA Galxy", TeamLevel.PROFESSIONAL);

        if (footballTeam.getTeamLevel() == TeamLevel.PROFESSIONAL) {
            System.out.println(footballTeam.getName() + " full profeska");
        }

        System.out.println(footballTeam.getName() + " " +
        provideDescription((footballTeam.getTeamLevel())));

        TeamLevel level = TeamLevel.getByAbbreviation("a");
        VolleyBallTeam volleyBallTeam = new VolleyBallTeam("Skra Bełchatow", level);
        System.out.println(volleyBallTeam.getName() + " " + volleyBallTeam.getTeamLevel().getPlace());

    }



    public static String provideDescription(TeamLevel level) {
        switch (level) {
            case PROFESSIONAL:
                return "poziom pro " + level.getPlace();
            case AMATEUR:
                return "poziom amator " + level.getPlace();
        }
        return "";
    }
}
