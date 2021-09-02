public class Casa {
    private String Propietario;
    private String color;
    private double largoCasas;
    private double anchoCasa;
    private double altoCasa;
    private int NumHabitaciones;
    private String Direccion;


    public Casa() {
        this.Propietario = "";
        this.color = "";
        this.largoCasas = 0.0;
        this.anchoCasa = 0.0;
        this.altoCasa = 0.0;
        this.NumHabitaciones = 0;
        this.Direccion = "";

    }

    public Casa(String propietario, String color, double largoCasas, double anchoCasa, double altoCasa, int numHabitaciones, String direccion) {
        this.Propietario = propietario;
        this.color = color;
        this.largoCasas = largoCasas;
        this.anchoCasa = anchoCasa;
        this.altoCasa = altoCasa;
        this.NumHabitaciones = numHabitaciones;
        this.Direccion = direccion;

    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLargoCasas() {
        return largoCasas;
    }

    public void setLargoCasas(double largoCasas) {
        this.largoCasas = largoCasas;
    }

    public double getAnchoCasa() {
        return anchoCasa;
    }

    public void setAnchoCasa(double anchoCasa) {
        this.anchoCasa = anchoCasa;
    }

    public double getAltoCasa() {
        return altoCasa;
    }

    public void setAltoCasa(double altoCasa) {
        this.altoCasa = altoCasa;
    }

    public int getNumHabitaciones() {
        return NumHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        NumHabitaciones = numHabitaciones;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
