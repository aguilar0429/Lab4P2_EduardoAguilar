package lab4p2_eduardoaguilar;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NEV extends Autos{
    private int tipo =1;
    private String modelo;
    private String VIN;
    private String carroceria;
    private int pasajeros;
    private int maletero;
    private int combustible;
    private int meses;
    private int velocidad;
    private String cambio;
    private int calculo;

    public NEV() {
        
        super();
    }

    public int getTipo() {
        return tipo;
    }

    public int getCalculo() {
        return calculo;
    }
    

    public NEV(String modelo, String VIN, String carroceria, int pasajeros, int maletero, int combustible, int meses, int velocidad, String cambio) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
        this.combustible = combustible;
        this.meses = meses;
        this.velocidad = velocidad;
        this.cambio = cambio;
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

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    

    @Override
    public String toString() {
        return "NEV: \nModelo: " + modelo + "\nVIN: " + VIN + "\nCarroceria: " + carroceria +"\nPasajeros: "+pasajeros+ "\nMaletero: " + maletero +" L.\nCombustible: " + combustible + "KM/L.\nMeses: " + meses + "meses. \nVelocidad: " + velocidad + "\nCambio: " + cambio ;
    }
    
    
    
    @Override
    public int calculo()throws miExcepcion{
        
        int part1 = (pasajeros*combustible);
        int part2=(meses*combustible);
        calculo =2021-part1-part2;
        if(calculo > 30){
            return calculo;
        }else{
            
            throw new miExcepcion(Color.red,"No es mayor a 30");
            
        }
        
    }

    public NEV(int pasajeros, int combustible, int meses) {
        this.pasajeros = pasajeros;
        this.combustible = combustible;
        this.meses = meses;
    }
    
    
    
    
}
 