package ru.javadaddy.roadmap.step5_AdvancedBase.topic6_Enums.task4_Season;

public class SeasonDemo {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season);
        }
    }
}
