package dosw.bitacora.Corte2.semana2.reportes.decorator;

import dosw.bitacora.Corte2.semana2.reportes.model.Report;

public class BasicReport implements ReportComponent {
    private Report report;

    public BasicReport(Report report) {
        this.report = report;
    }

    @Override
    public String generate() {
        return report.getContent();
    }
}
