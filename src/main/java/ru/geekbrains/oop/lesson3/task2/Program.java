package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(15);
        for (Employee worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(workers);
        Arrays.sort(workers, new ClearanceLevelComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }
    }

}
