package dosw.bitacora.Corte1.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {

        public static void run() {

                System.out.println("\n========== EJERCICIOS STREAMS ==========\n");

                // EJERCICIO 1

                List<Integer> numbers = Arrays.asList(3, 8, 10, 12, 15, 20, 7, 30);

                List<Integer> evenGreaterThanTen = numbers.stream()
                                .filter(n -> n % 2 == 0)
                                .filter(n -> n > 10)
                                .collect(Collectors.toList());

                System.out.println("Pares mayores a 10: " + evenGreaterThanTen);

                // EJERCICIO 2

                List<String> words = Arrays.asList("java", "spring", "boot", "stream", "api", "backend");

                List<String> filteredWords = words.stream()
                                .filter(w -> w.length() > 4)
                                .map(String::toUpperCase)
                                .sorted()
                                .collect(Collectors.toList());

                long totalWords = filteredWords.size();

                System.out.println("Palabras filtradas: " + filteredWords);
                System.out.println("Cantidad total: " + totalWords);

                // EJERCICIO 3

                List<User> users = Arrays.asList(
                                new User(1L, "Isaac", 20, true),
                                new User(2L, "Ana", 16, true),
                                new User(3L, "Carlos", 25, false),
                                new User(4L, "Laura", 17, true),
                                new User(5L, "Pedro", 30, true));

                List<String> activeUsers = users.stream()
                                .filter(User::isActive)
                                .map(u -> u.getName().toUpperCase())
                                .sorted()
                                .collect(Collectors.toList());

                System.out.println("Usuarios activos: " + activeUsers);

                // EJERCICIO 4

                List<String> adultUsers = users.stream()
                                .filter(u -> u.getAge() >= 18)
                                .map(User::getName)
                                .collect(Collectors.toList());

                System.out.println("Usuarios mayores de edad: " + adultUsers);

                // EJERCICIO 5

                List<Transaction> transactions = Arrays.asList(
                                new Transaction("T1", 100.0, true),
                                new Transaction("T2", 250.5, true),
                                new Transaction("T3", 80.0, false),
                                new Transaction("T4", 300.0, true));

                boolean hasNotApproved = transactions.stream()
                                .peek(t -> System.out.println("Procesando transacción: " + t))
                                .anyMatch(t -> !t.isApproved());

                boolean isValidBatch = !hasNotApproved;

                System.out.println("Â¿Existe alguna transacción no aprobada? " + hasNotApproved);
                System.out.println("Â¿El lote de transacciones es válido? " + isValidBatch);

        }
}
