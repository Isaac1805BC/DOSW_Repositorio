package dosw.bitacora.Corte2.semana1.analiticas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private String subject;
    private double score;
    private LocalDate date;
    private boolean passed;
}
