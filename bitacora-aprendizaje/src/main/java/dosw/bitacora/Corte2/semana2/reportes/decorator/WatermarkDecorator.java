package dosw.bitacora.Corte2.semana2.reportes.decorator;

public class WatermarkDecorator extends ReportDecorator {
    public WatermarkDecorator(ReportComponent component) {
        super(component);
    }

    @Override
    public String generate() {
        return super.generate() + "\n[Marca de Agua: CONFIDENCIAL]";
    }
}
