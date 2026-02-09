package dosw.bitacora;

import dosw.bitacora.semana1.streams.StreamExercises;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        StreamExercises.run(); 
    }
}
