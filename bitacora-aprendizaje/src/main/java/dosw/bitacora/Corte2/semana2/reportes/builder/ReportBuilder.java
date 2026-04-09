package dosw.bitacora.Corte2.semana2.reportes.builder;

import dosw.bitacora.Corte2.semana2.reportes.model.Report;

public class ReportBuilder {
    private Report report;

    public ReportBuilder(String format) {
        report = new Report();
        report.setFormat(format);
    }

    public ReportBuilder addGeneralInfo(String info) {
        report.setGeneralInfo(info);
        return this;
    }

    public ReportBuilder addStatistics(String stats) {
        report.setStatistics(stats);
        return this;
    }

    public ReportBuilder addTransactionDetails(String details) {
        report.setTransactionDetails(details);
        return this;
    }

    public ReportBuilder addFinalSummary(String summary) {
        report.setFinalSummary(summary);
        return this;
    }

    public Report build() {
        return report;
    }
}
