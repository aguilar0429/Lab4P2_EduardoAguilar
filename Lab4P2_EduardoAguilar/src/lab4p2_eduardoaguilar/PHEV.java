
package lab4p2_eduardoaguilar;

import java.awt.Color;


public class PHEV extends Autos{
    private int tipo =3;
    private String modelo;
    private String VIN;
    private String carroceria;
    private int pasajeros;
    private int maletero;
    private int kilometros;
    private int motores;
    private int remolque;
    private String cuatro;
    private int calculo;
    /*public PHEV() {
        super();
    }*/

    public int getCalculo() {
        return calculo;
    }

    public PHEV(String modelo, String VIN, String carroceria, int pasajeros, int maletero, int kilometros, int motores, int remolque, String cuatro) {
        this.modelo = modelo;
        this.VIN = VIN;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
        this.kilometros = kilometros;
        this.motores = motores;
        this.remolque = remolque;
        this.cuatro = cuatro;
    }

    public int getTipo() {
        return tipo;
    }
    

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRemolque() {
        return remolque;
    }

    public void setRemolque(int remolque) {
        this.remolque = remolque;
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

    public String getCuatro() {
        return cuatro;
    }

    public void setCuatro(String cuatro) {
        this.cuatro = cuatro;
    }

    @Override
    public String toString() {
        return "PHEV:\nModelo: " + modelo + "\nVIN: " + VIN + "\nCarroceria: " + carroceria + "\nPasajeros: " + pasajeros + "\nMaletero: " + maletero + "L.\nKilometros: " + kilometros +"\nCantidad de motores electricos:  "+motores+"\nCapacidad de remolque: "+remolque+"Toneladas.\n4x4: " + cuatro;
    }
    @Override
    public int calculo()throws miExcepcion{
        int part1 = (pasajeros)*(motores);
        int part2 = (kilometros/remolque);
        calculo = 2021-part1+part2;
        if(calculo > 30){
            return calculo;
        }else{
            throw new miExcepcion(Color.red,"No es mayor a 30");
        }
    }

    public PHEV(int pasajeros, int kilometros, int motores, int remolque) {
        this.pasajeros = pasajeros;
        this.kilometros = kilometros;
        this.motores = motores;
        this.remolque = remolque;
    }
    
    

    
    
    
    
}
