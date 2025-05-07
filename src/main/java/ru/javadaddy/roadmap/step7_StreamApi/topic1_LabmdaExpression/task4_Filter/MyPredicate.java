package ru.javadaddy.roadmap.step7_StreamApi.topic1_LabmdaExpression.task4_Filter;

@FunctionalInterface
public interface MyPredicate<T> {
    boolean test(T t);
}
