package ru.lis154;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        // Создание ThreadPoolExecutor с фиксированным размером пула
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        // Запуск 5 задач
        for (int i = 0; i < 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                // Генерация случайного числа и сохранение в ThreadLocal переменной
                int randomNumber = ThreadLocalRandom.current().nextInt(100);
                threadLocal.set(randomNumber);

                // Получение значения из ThreadLocal переменной и вывод на экран
                System.out.println("Task " + taskNumber + ": Random number = " + threadLocal.get());

                // Ожидание некоторое время для имитации выполнения задачи
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Очистка значения ThreadLocal переменной
                threadLocal.remove();
            });
        }

        // Завершение ThreadPoolExecutor
        executor.shutdown();
    }
}