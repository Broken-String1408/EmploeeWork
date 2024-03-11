package ru.geekbrains.oop.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    int workHours;
    private Freelancer(String surName, String name, double salary, int workHours,  String clearanceLevel) {
        super(surName, name, salary, clearanceLevel);
        this.workHours = workHours;
    }
    public static Freelancer create(String surName, String name, double salary, int workHours, String clearanceLevel){
        return new Freelancer(surName, name, salary, workHours, clearanceLevel);
    }

    @Override
    public double calculateSalary() {
        return salary*workHours;
    }
    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата за %s часов: %.2f руб.; ур. допуска: %s.",
                surName, name, salary, workHours, calculateSalary(), clearanceLevel);
    }
}
