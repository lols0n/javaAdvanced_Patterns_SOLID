package com.company.generics.fullGeneric;

import com.company.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class League<T, V> { // przez te parametry musimy rzutowac
    private String leagueName;
    private List<T> teams;
    private Set<V> someSet;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>();//samo inicjowanie obiektu
    }

    public boolean addTeam(T team) {
        if (!teams.contains(team)) {
            System.out.println("Adding: " + ((Team)team).getName() + " to: " + leagueName);  //rzutowanie
            return teams.add(team);
        }
        System.out.println(((Team)team).getName() + " already in " + leagueName);           //rzutowanie
        return false;
    }

    public void printTable() {
        Collections.sort((List<Team>) teams);
        System.out.println(leagueName + " table:");
        for (T team : teams) {
            System.out.println(((Team)team).getName() + " " + ((Team)team).getPoints());
        }
    }
}
