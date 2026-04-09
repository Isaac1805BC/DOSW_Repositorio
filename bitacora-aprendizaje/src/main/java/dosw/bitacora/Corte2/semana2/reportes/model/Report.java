package dosw.bitacora.Corte2.semana2.reportes.model;

import lombok.Data;

@Data
public class Report {
    private String format;
    private String generalInfo;
    private String statistics;
    private String transactionDetails;
    private String finalSummary;

    public String getContent() {
        return "Reporte [" + format + "]\n" +
               "Info: " + generalInfo + "\n" +
               "Stats: " + statistics + "\n" +
               "Details: " + transactionDetails + "\n" +
               "Summary: " + finalSummary;
    }
}
