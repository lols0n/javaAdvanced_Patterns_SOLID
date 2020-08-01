package com.company.patterns.creational.builder;

public class Hause {

    private String basement;
    private String walls;
    private String roof;

    private String garage;
    private String garden;

    private Hause(HauseBuilder builder) {
        this.basement = builder.basement;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.garage = builder.garage;
        this.garden = builder.garden;
    }

    public String getBasement() {
        return basement;
    }

    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public String getGarage() {
        if (garage == null) {
            return "";
        }return garage;
    }

    public String getGarden() {
        if (garden == null) {
            return "";
        }return garden;
    }

    public static class HauseBuilder {

        private String basement;
        private String walls;
        private String roof;

        private String garage;
        private String garden;

        public HauseBuilder(String basement, String walls, String roof) {
            this.basement = basement;
            this.walls = walls;
            this.roof = roof;
        }

        public HauseBuilder withGarden(String garden) {
            this.garden = garden;
            return this;
        }

        public HauseBuilder withGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public Hause build() {
            return new Hause(this);
        }
    }
}
