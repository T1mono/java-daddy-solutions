package ru.javadaddy.roadmap.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

import java.util.Arrays;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        Integer[] newInt = {1, 2};

        ArrayUtils.swap(newInt, 0, 1);

        System.out.println(Arrays.toString(newInt));
    }
}
