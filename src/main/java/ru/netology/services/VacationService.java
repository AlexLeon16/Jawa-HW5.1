package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                //сначала вычитаем обязательные траты, потом траты на отдых (остаток / 3)
                count++;
                money -= expenses; // обязательные траты
                money /= 3; // траты на отдых (деление на 3)
            } else {
                // добавляем доход и вычитаем обязательные траты
                money += income;
                money -= expenses;
            }
        }

        return count;
    }
}
