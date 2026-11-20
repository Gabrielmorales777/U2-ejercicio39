
public class PuntoVenta {

    private LectorOptico lector;

    public PuntoVenta(LectorOptico lector) {
        this.lector = lector;
    }

    public void procesarProducto() {

        System.out.println("Procesando producto...");

        String codigo = lector.escanearCodigo();

        if (codigo != null && !codigo.trim().isEmpty()) {

            System.out.println("Codigo detectado: " + codigo);
            System.out.println("Producto procesado correctamente.");

        } else {

            System.out.println("Error: no se pudo leer el codigo.");
        }
    }

    public void cambiarLector(LectorOptico lector) {
        this.lector = lector;
    }
}
