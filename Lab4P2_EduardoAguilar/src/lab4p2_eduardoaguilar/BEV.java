package lab4p2_eduardoaguilar;

import java.awt.Color;


public class BEV extends Autos{
    private int tipo =4;
    private String modelo;
    private String VIN;
    private String carroceria;
    private int pasajeros;
    private int maletero;
    private int kilometros;
    private int baterias;
    private int aceleracion;
    private int carga;
    private int calculo;

    

    public BEV(String modelo, String VIN, String carroceria, int pasajeros, int maletero, int kilometros, int baterias, int aceleracion, int carga) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
        this.kilometros = kilometros;
        this.baterias = baterias;
        this.aceleracion = aceleracion;
        this.carga = carga;
    }

    public int getTipo() {
        return tipo;
    }

    public int getCalculo() {
        return calculo;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getBaterias() {
        return baterias;
    }

    public void setBaterias(int baterias) {
        this.baterias = baterias;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "BEV:\nModelo: " + modelo + "\nVIN: " + VIN + "\nCarroceria: " + carroceria + "\nPasajeros: " + pasajeros + "\nMaletero: " + maletero + "L.\nKilometros: " + kilometros + "\nBaterias; " + baterias + "\nAceleracion: " + aceleracion + "segundos.\nCarga: " + carga +"minutos.";
    }
    
    @Override
    public int calculo() throws miExcepcion{
        int part1 = (baterias+(carga*pasajeros));
        int part2 = part1/aceleracion;
        calculo = 
                2021-part2;
        if(calculo > 30){
            return calculo;
        }else{
            throw new miExcepcion(Color.red,"No es mayor a 30");
        }
    }

    public BEV(int pasajeros, int baterias, int aceleracion, int carga) {
        this.pasajeros = pasajeros;
        this.baterias = baterias;
        this.aceleracion = aceleracion;
        this.carga = carga;
    }
    
    
    
    
    
}
