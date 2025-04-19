package ru.javadaddy.roadmap.step5_AdvancedBase.topic2_Exceptions.task3_FileNotFoundException;

public class FileReader {
    public static void main(String[] args) {
        try {
            java.io.FileReader fileReader = new java.io.FileReader("/dddd");
            System.out.println(fileReader);
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
