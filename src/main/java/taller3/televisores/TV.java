package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca Nmarca, boolean Nestado){
        marca = Nmarca;
        estado = Nestado;
    }

    public void setMarca(Marca marca) {this.marca = marca;}

    public Marca getMarca() {return marca;}

    public void setCanal(int canal) {this.canal = canal;}

    public int getCanal() {return canal;}

    public void setPrecio(int precio) {this.precio = precio;}

    public int getPrecio() {return precio;}

    public void setVolumen(int volumen) {this.volumen = volumen;}

    public int getVolumen() {return volumen;}

    public void setControl(Control control) {this.control = control;}

    public Control getControl() {return control;}

    public static int getNumTV() {return numTV;}

    public void turnOn() {this.estado = true;}

    public void turnOff() {this.estado = false;}

    public boolean getEstado() {return estado;}

    public void canalUp() {
        if (canal < 120 && getEstado()) canal++;
    }

    public void canalDown() {
        if (canal > 1 && getEstado()) canal--;
    }

    public void volumenUp() {
        if (volumen < 7 && getEstado()) volumen++;
    }

    public void volumenDown() {
        if (volumen > 0 && getEstado()) volumen--;
    }
}
