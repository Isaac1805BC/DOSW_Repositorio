package dosw.bitacora.Corte2.semana2.reportes.decorator;

public abstract class ReportDecorator implements ReportComponent {
    protected ReportComponent component;

    public ReportDecorator(ReportComponent component) {
        this.component = component;
    }

    @Override
    public String generate() {
        return component.generate();
    }
}
