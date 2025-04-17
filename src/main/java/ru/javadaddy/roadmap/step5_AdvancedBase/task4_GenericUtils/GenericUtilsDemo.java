package ru.javadaddy.roadmap.step5_AdvancedBase.task4_GenericUtils;

public class GenericUtilsDemo {
    public static void main(String[] args) {
        System.out.println("Проверка с числами");
        System.out.println(GenericUtils.max(1423, 555));

        System.out.println("Проверка со строками");
        System.out.println(GenericUtils.max("Petya", "Vladimir"));
    }
}