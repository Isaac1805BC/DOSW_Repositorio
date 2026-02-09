package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {

    public static void run() {

        System.out.println("=== EJERCICIOS STREAMS ===");

        List<User> users = Arrays.asList(
                new User(1L, "Isaac", 20, true),
                new User(2L, "Ana", 16, true),
                new User(3L, "Carlos", 25, false),
                new User(4L, "Laura", 17, true),
                new User(5L, "Pedro", 30, true)
        );

        List<String> adultNames = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .collect(Collectors.toList());

        System.out.println("Usuarios mayores de edad: " + adultNames);
    }
}
