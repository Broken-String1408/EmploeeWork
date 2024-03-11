package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] clearanceLevels = new String[] {"A1","A2","A3","B1","B2","B3","C1","C2","C3"};
        if(random.nextBoolean()) {
            int salary = random.nextInt(60000, 120001);
            return Worker.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary,
                    clearanceLevels[random.nextInt(clearanceLevels.length)]);
        }
        else{
            int salary = random.nextInt(1000, 5000);
            return Freelancer.create(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary,
                    random.nextInt(32, 160),
                    clearanceLevels[random.nextInt(clearanceLevels.length)]);
        }
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++){
            workers[i] = generateWorker();
        }
        return workers;
    }



}
