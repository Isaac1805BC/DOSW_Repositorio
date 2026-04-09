package dosw.bitacora.Corte2.semana2.reportes;

import dosw.bitacora.Corte2.semana2.reportes.builder.ReportBuilder;
import dosw.bitacora.Corte2.semana2.reportes.decorator.*;
import dosw.bitacora.Corte2.semana2.reportes.model.Report;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportSystemTest {

    @Test
    void testReportBuilder() {
        Report report = new ReportBuilder("PDF")
                .addGeneralInfo("Info")
                .addStatistics("Stats")
                .addTransactionDetails("Details")
                .addFinalSummary("Summary")
                .build();
        
        assertEquals("PDF", report.getFormat());
        assertTrue(report.getContent().contains("Stats"));
    }

    @Test
    void testReportDecorators() {
        Report report = new ReportBuilder("JSON").addGeneralInfo("Quick Report").build();
        ReportComponent basic = new BasicReport(report);
        
        ReportComponent signed = new DigitalSignatureDecorator(basic);
        ReportComponent watermarked = new WatermarkDecorator(signed);
        
        String finalContent = watermarked.generate();
        
        assertTrue(finalContent.contains("JSON"));
        assertTrue(finalContent.contains("[Firma Digital Aplicada]"));
        assertTrue(finalContent.contains("[Marca de Agua: CONFIDENCIAL]"));
    }
}
