package modelos;

public class Laptop extends Dispositivo {
    private int cantidadRam;

    public Laptop(String marca, String modelo, double precio, int cantidadRam) {
        super(marca, modelo, precio);
        this.cantidadRam = cantidadRam;
    }

    public int getCantidadRam() { return cantidadRam; }
    public void setCantidadRam(int cantidadRam) { this.cantidadRam = cantidadRam; }

    @Override
    public void conectarInternet() {
        System.out.println("El dispositivo " + getMarca() + " " + getModelo() +
                ": Se ha conectado a internet vía Ethernet.");
    }

    public void mostrarEspecificaciones() {
        System.out.println("Especificaciones: " + cantidadRam + " GB de RAM.");
    }

    // Sobrecarga
    public void instalarSoftware(String nombreSoftware) {
        System.out.println("Instalando " + nombreSoftware + " en la laptop " + getModelo());
    }

    public void instalarSoftware(String nombreSoftware, String version) {
        System.out.println("Instalando " + nombreSoftware + " versión " + version +
                " en la laptop " + getModelo());
    }
}
