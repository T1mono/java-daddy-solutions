package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task4_Season;

public enum Season {
    WINTER(-10.32), SPRING(8.4), SUMMER(22.3), FALL(0.7);

    private final double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    @Override
    public String toString() {
        return "- " + "avgTemp = " + avgTemp + "°C";
    }
}
