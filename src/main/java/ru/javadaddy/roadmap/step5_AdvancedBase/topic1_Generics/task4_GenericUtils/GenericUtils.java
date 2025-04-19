package ru.javadaddy.roadmap.step5_AdvancedBase.topic1_Generics.task4_GenericUtils;

public class GenericUtils {
    public static <T extends Comparable<T>> T max (T a, T b) {
        if (a.compareTo(b) > 0) {
            return a;
        } else {
            return b;
        }
    }
}
