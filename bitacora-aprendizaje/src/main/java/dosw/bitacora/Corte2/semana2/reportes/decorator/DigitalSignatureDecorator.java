package dosw.bitacora.Corte2.semana2.reportes.decorator;

public class DigitalSignatureDecorator extends ReportDecorator {
    public DigitalSignatureDecorator(ReportComponent component) {
        super(component);
    }

    @Override
    public String generate() {
        return super.generate() + "\n[Firma Digital Aplicada]";
    }
}
