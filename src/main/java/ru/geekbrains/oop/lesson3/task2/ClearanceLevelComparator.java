package ru.geekbrains.oop.lesson3.task2;

import java.util.Comparator;

public class ClearanceLevelComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.clearanceLevel.compareTo(o2.clearanceLevel);
    }
}
