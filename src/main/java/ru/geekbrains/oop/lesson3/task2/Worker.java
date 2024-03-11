package ru.geekbrains.oop.lesson3.task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee{

    private Worker(String surName, String name, double salary, String clearanceLevel) {
        super(surName, name, salary, clearanceLevel);
    }

    public static Worker create(String surName, String name, double salary, String clearanceLevel){
        return new Worker(surName, name, salary, clearanceLevel);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.; ур. допуска: %s.",
                surName, name, salary, calculateSalary(), clearanceLevel);
    }
}
