package lab4p2_eduardoaguilar;

import java.awt.Color;


public class HEV extends Autos {
    private int tipo =2;
    private String modelo;
    private String VIN;
    private String carroceria;
    private int pasajeros;
    private int maletero;
    private int bateria;
    private int motor;
    private int calculo;

    public HEV() {
        super();
    }

    public int getTipo() {
        return tipo;
    }

    public int getCalculo() {
        return calculo;
    }
    

    public HEV(String modelo, String VIN, String carroceria, int pasajeros, int maletero, int bateria, int motor) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
        this.bateria = bateria;
        this.motor = motor;
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

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "HEV: \nModelo: " + modelo + "\nVIN: " + VIN + "\nCarroceria: " + carroceria + "\nPasajeros: " + pasajeros + "\nMaletero: " + maletero + "L.\nBateria: " + bateria + "KW/H.\nMotor: " + motor+"KW.";
    }
    public int calculo()throws miExcepcion{
        int part1 = (bateria*maletero);
        int part2 = part1/pasajeros;
        calculo= 2021-part2;
        if(calculo > 30){
            return calculo;
        }else{
            throw new miExcepcion(Color.red,"No es mayor a 30");
        }
    
    }

    public HEV(int pasajeros, int maletero, int bateria) {
        this.pasajeros = pasajeros;
        this.maletero = maletero;
        this.bateria = bateria;
    }
    
    
    
    
    
    
}
