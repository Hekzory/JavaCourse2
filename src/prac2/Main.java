package prac2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human(90, "John", "Doe", LocalDate.of(1948,  1,  1),  70));
        humans.add(new Human(25, "Jane", "Smith", LocalDate.of(2000,  6,  15),  60));
        humans.add(new Human(40, "Mary", "Johnson", LocalDate.of(1980,  7,  10),  80));
        humans.add(new Human(20, "James", "Williams", LocalDate.of(2005,  2,  20),  65));
        humans.add(new Human(50, "Emma", "Brown", LocalDate.of(1975,  12,  31),  75));

        System.out.println("Исходный список: " + humans);

        // Сортировка по последней букве фамилии
        List<Human> resultHuman1 = humans.stream()
                .sorted(Comparator.comparing(human -> human.getLastName().charAt(human.getLastName().length() -  1)))
                .toList();

        System.out.println("Сортировка по последней букве фамилии: " + resultHuman1);

        // Фильтрация, где вес больше возраста
        List<Human> resultHuman2 = humans.stream()
                .filter(human -> human.getAge() > human.getWeight())
                .toList();

        System.out.println("Фильтрация, где вес больше возраста: " + resultHuman2);

        // Сортировка по дате рождения
        List<Human> resultHuman3 = humans.stream()
                .sorted(Comparator.comparing(Human::getBirthDate))
                .toList();

        System.out.println("Сортировка по дате рождения: " + resultHuman3);

        // Произведение возрастов
        int productOfAges = humans.stream()
                .mapToInt(Human::getAge)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Произведение возрастов: " + productOfAges);
    }
}
