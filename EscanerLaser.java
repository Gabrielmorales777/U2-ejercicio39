
public class EscanerLaser implements LectorOptico {

    @Override
    public String escanearCodigo() {

        System.out.println("Escaneando codigo de barras con laser...");

        return "7791234567890";
    }
}
