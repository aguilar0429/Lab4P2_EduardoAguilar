package lab4p2_eduardoaguilar;

import java.util.ArrayList;


public abstract class Autos {
    private ArrayList <NEV> carro;
    private ArrayList <HEV> carro1;
    private ArrayList <PHEV> carro2;
    private ArrayList <BEV> carro3;
    private String modelo;
    private String VIN;
    private String carroceria;
    private int pasajeros;
    private int maletero;

    public Autos() {
        
    }

    public Autos( String modelo, String VIN, String carroceria, int pasajeros, int maletero) {
        
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
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

    

    public ArrayList<NEV> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<NEV> carro) {
        this.carro = carro;
    }

    public ArrayList<HEV> getCarro1() {
        return carro1;
    }

    public void setCarro1(ArrayList<HEV> carro1) {
        this.carro1 = carro1;
    }

    public ArrayList<PHEV> getCarro2() {
        return carro2;
    }

    public void setCarro2(ArrayList<PHEV> carro2) {
        this.carro2 = carro2;
    }

    public ArrayList<BEV> getCarro3() {
        return carro3;
    }

    public void setCarro3(ArrayList<BEV> carro3) {
        this.carro3 = carro3;
    }
    
    
    

    /*@Override
    public String toString() {
        return "Autos: \nCarro: " + carro + "\nCarro1: " + carro1 + "\nCarro2: " + carro2 + "\nCarro3: " + carro3;
    }*/
    
    
    public abstract int calculo() throws miExcepcion;
    public abstract int getTipo();
    
    
    
    
    
    
    
}
