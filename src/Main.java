import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> employees = new ArrayList<>();

        // Пример данных
        Map<String, String> employee1 = new HashMap<>();
        employee1.put("name", "John");
        employee1.put("age", "25");
        employee1.put("salary", "50000");
        employee1.put("currency", "USD");

        Map<String, String> employee2 = new HashMap<>();
        employee2.put("name", "Alice");
        employee2.put("age", "32");
        employee2.put("salary", "70000");
        employee2.put("currency", "RUB");

        Map<String, String> employee3 = new HashMap<>();
        employee3.put("name", "Bob");
        employee3.put("age", "28");
        employee3.put("salary", "60000");
        employee3.put("currency", "RUB");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        // Вывести имена всех сотрудников, младше 30
        System.out.println("Имена сотрудников, младше 30:");
        employees.stream()
                .filter(emp -> Integer.parseInt(emp.get("age")) < 30)
                .map(emp -> emp.get("name"))
                .forEach(System.out::println);

        // Вывести имена всех сотрудников, получающих зарплату в рублях
        System.out.println("\nИмена сотрудников, получающих зарплату в рублях:");
        employees.stream()
                .filter(emp -> emp.get("currency").equals("RUB"))
                .map(emp -> emp.get("name"))
                .forEach(System.out::println);

        // Вывести средний возраст всех сотрудников
        double averageAge = employees.stream()
                .mapToInt(emp -> Integer.parseInt(emp.get("age")))
                .average()
                .orElse(0);
        System.out.println("\nСредний возраст всех сотрудников: " + averageAge);
    }
}
