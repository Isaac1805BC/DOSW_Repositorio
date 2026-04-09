package dosw.bitacora.Corte1.semana3.Empresa_De_Videojuegos;

public class MotorJuego {
    private Control control;
    private Juego juego;
    private InterfazGrafica interfaz;

    
    public MotorJuego(ConsolaFactory factory) {
        control = factory.crearControl();
        juego = factory.crearJuego();
        interfaz = factory.crearInterfaz();
    }

    public void arrancar() {
        control.conectarse();
        juego.iniciarse();
        interfaz.renderizar();
    }

    public static void main(String[] args) {
        System.out.println("--- Iniciando Consola PlayStation ---");
        ConsolaFactory psFactory = new PlayStationFactory();
        MotorJuego motorPS = new MotorJuego(psFactory);
        motorPS.arrancar();

        System.out.println("\n--- Iniciando Consola Xbox ---");
        ConsolaFactory xboxFactory = new XboxFactory();
        MotorJuego motorXbox = new MotorJuego(xboxFactory);
        motorXbox.arrancar();
    }
}
