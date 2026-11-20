
public class CamaraQR implements LectorOptico {

    @Override
    public String escanearCodigo() {

        System.out.println("Capturando codigo QR con camara...");

        return "QR-PRODUCTO-001";
    }
}
