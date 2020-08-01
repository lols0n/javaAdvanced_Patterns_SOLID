package com.company.javaAdvenced.generics;

//ENUM CZYLI TYP WYLICZENIOWY
//ZE Ściśle okreslana predefiniowana lista wartosci
//dodanie kolejnej wartosci mozliwe tylko wewnatrz enuma nie ma mozliwosci
//dorobienia przez new()
//w trakcie dzialania programu nie mozna dodawac ani odejmowac wartosci

public enum  TeamLevel {
//    AMATEUR,
//    PROFESSIONAL;
    AMATEUR("stadion", 200, "A"),
    PROFESSIONAL("arena", 20000, "P"),;

    private String place;
    private int fans;
    private String abbreviation;

    TeamLevel(String place, int fans, String abbreviation) {
        this.place = place;
        this.fans = fans;
        this.abbreviation = abbreviation;
    }

    public String getPlace() {
        return place;
    }

    public int getFans() {
        return fans;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static TeamLevel getByAbbreviation(String abbrev) {
        //petla po wszystkich elementach enuma
        for (TeamLevel level : TeamLevel.values()) {
            //dla kazdego elementu wycagamy pole abbreviation
            //i porownojemy z otrzymanym parametrem abbrev
            if (abbrev.equalsIgnoreCase(level.abbreviation)) {
                //jak znajdujemy pasujacy to zwracamy TeamLevel
                return level;
            }
        }
        return null;

    }
}
