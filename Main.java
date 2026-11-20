
public class Main {

    public static void main(String[] args) {

        LectorOptico laser = new EscanerLaser();
        LectorOptico camara = new CamaraQR();

        PuntoVenta caja = new PuntoVenta(laser);

        System.out.println("=== SISTEMA DE PUNTO DE VENTA ===");

        System.out.println("\n--- LECTURA CON ESCANER LASER ---");

        caja.procesarProducto();

        caja.cambiarLector(camara);

        System.out.println("\n--- LECTURA CON CAMARA QR ---");

        caja.procesarProducto();
    }
}
