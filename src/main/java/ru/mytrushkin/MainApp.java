package ru.mytrushkin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<Persons> persons = new ArrayList<>(Arrays.asList(
                new Persons("Вася", "Программист", 40),
                new Persons("Петя", "Программист", 20),
                new Persons("Коля", "Менеджер", 35),
                new Persons("Жана", "Менеджер", 43),
                new Persons("Люда", "Программист", 56)
        ));

        List<String> persons_str = persons.stream()
                .filter(p -> p.position.equals("Программист"))
                .sorted((o1, o2) -> o2.age - o1.age)
                .map(p -> p.name).collect(Collectors.toList());

        System.out.println(persons_str);
    }
}
