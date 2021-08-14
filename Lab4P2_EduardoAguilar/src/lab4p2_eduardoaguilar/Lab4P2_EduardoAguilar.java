package lab4p2_eduardoaguilar;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4P2_EduardoAguilar {

    static Scanner sc = new Scanner(System.in);
    static private int dias;
    static private String tipo_cambio;
    static private String cuatro;
    public static void main(String[] args) {
        ArrayList <Autos> autos = new ArrayList(); 
        System.out.println("1. Agregar Auto\n"
                + "2. Listar\n"
                + "3. Modificar\n"
                + "4. Eliminar\n"
                + "5. Calculo\n"
                + "6. Salir");
        int opcion = sc.nextInt();
        while(opcion !=6){
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese tipo de auto: \n"
                    +"1. Combustion\n"
                    +"2. Hibrido\n"
                    +"3. Hibrido Enchufable\n"
                    +"4. Electrico");
                    int op_auto = sc.nextInt();
                    switch(op_auto){
                        case 1:{
                            System.out.println("Ingrese Modelo: ");
                            sc.nextLine();
                            String modelo = sc.next();
                            System.out.println("Ingrese identificador: ");
                            sc.nextLine();
                            String VIN = sc.next();
                            System.out.println("Ingrese carroceria: ");
                            sc.nextLine();
                            String carroceria = sc.nextLine();
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            System.out.println("Ingrese capacidad de maletero: ");
                            int maletero = sc.nextInt();
                            System.out.println("Ingrese consumo de combustible: ");
                            int combustible = sc.nextInt();
                            System.out.println("Ingrese duracion del aceite: ");
                            int aceite = sc.nextInt();
                            System.out.println("Ingrese velocidad maxima: ");
                            int velocidad = sc.nextInt();
                            System.out.println("Ingrese opcion de cambio: \n"
                            +"1. Mecanico\n"
                            +"2. Automatico");
                            int cambio = sc.nextInt();
                            switch(cambio){
                                case 1:{
                                    tipo_cambio = "Mecanico";
                                    break;
                                }case 2:{
                                    tipo_cambio = "Automatico";
                                }
                                    
                            }// fin switch cambio
                            NEV n = new NEV(modelo,VIN,carroceria,pasajeros,maletero,combustible, aceite, velocidad, tipo_cambio);
                            autos.add(n);
                            break;
                        }case 2:{
                            System.out.println("Ingrese Modelo: ");
                            sc.nextLine();
                            String modelo = sc.next();
                            System.out.println("Ingrese identificador: ");
                            sc.nextLine();
                            String VIN = sc.next();
                            System.out.println("Ingrese carroceria: ");
                            sc.nextLine();
                            String carroceria = sc.nextLine();
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            System.out.println("Ingrese capacidad de maletero: ");
                            int maletero = sc.nextInt();
                            System.out.println("Ingrese capacidad de bateria: ");
                            int bateria = sc.nextInt();
                            System.out.println("Capacidad de motor electrico: ");
                            int motor = sc.nextInt();
                            
                            HEV h = new HEV(modelo,VIN,carroceria,pasajeros,maletero,bateria,motor);
                            autos.add(h);
                            
                            break;
                        }case 3:{
                            System.out.println("Ingrese Modelo: ");
                            sc.nextLine();
                            String modelo = sc.next();
                            System.out.println("Ingrese identificador: ");
                            sc.nextLine();
                            String VIN = sc.next();
                            System.out.println("Ingrese carroceria: ");
                            sc.nextLine();
                            String carroceria = sc.nextLine();
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            System.out.println("Ingrese capacidad de maletero: ");
                            int maletero = sc.nextInt();
                            System.out.println("Capacidad de kilometros en modo electrico: ");
                            int kilometros = sc.nextInt();
                            System.out.println("Cantidad de motores electricos: ");
                            int motores = sc.nextInt();
                            System.out.println("Capacidad de remolque: ");
                            int remolque = sc.nextInt();
                            System.out.println("4x4? [S]/[N]");
                            char capacidad = sc.next().charAt(0);
                            while(capacidad !='S' && capacidad!='N'){
                                System.out.println("4x4? [S]/[N]");
                                capacidad = sc.next().charAt(0);
                            }
                            if(capacidad == 'S'){
                                cuatro = "Si";
                            }else{
                                cuatro = "No";
                            }
                            PHEV p = new PHEV(modelo,VIN,carroceria,pasajeros,maletero,kilometros,motores,remolque,cuatro);
                            autos.add(p);
                            break;
                        }case 4:{
                            System.out.println("Ingrese Modelo: ");
                            sc.nextLine();
                            String modelo = sc.next();
                            System.out.println("Ingrese identificador: ");
                            sc.nextLine();
                            String VIN = sc.next();
                            System.out.println("Ingrese carroceria: ");
                            sc.nextLine();
                            String carroceria = sc.nextLine();
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            System.out.println("Ingrese capacidad de maletero: ");
                            int maletero = sc.nextInt();
                            System.out.println("Capacidad de kilometros que recorre: ");
                            int kilometros = sc.nextInt();
                            System.out.println("Cantidad de baterias que almacena: ");
                            int baterias = sc.nextInt();
                            System.out.println("Aceleracion de 0 - 100: ");
                            int aceleracion = sc.nextInt();
                            while(aceleracion < 0 || aceleracion>100 ){
                                System.out.println("Aceleracion de 0 - 100: ");
                                aceleracion = sc.nextInt();
                            }
                            System.out.println("Tiempo de duracion de carga completa" );
                            int carga = sc.nextInt();
                            
                            BEV b = new BEV(modelo,VIN,carroceria,pasajeros,maletero,kilometros,baterias,aceleracion,carga);
                            autos.add(b);
                            
                            
                        }// fin case 4
                    }// fin switch tipos de carro
                    
                    break;
                }case 2:{
                    for(int i =0; i<autos.size();i++){
                        System.out.println((i+1)+". "+autos.get(i));
                    }
                    break;
                }case 3:{
                    System.out.println("Ingrese carro a modificar: ");
                    for(int i =0; i<autos.size();i++){
                        System.out.println((i)+". "+autos.get(i).getModelo());
                    }
                    int carro = sc.nextInt();
                    int tipo = autos.get(carro).getTipo();
                    switch(tipo){
                        case 1:{
                            System.out.println("Ingrese opcion a modificar: "
                            +"1. Modelo\n"
                            +"2. VIN\n"
                            +"3. Carroceria\n"
                            +"4. Pasajeros\n"
                            +"5. Maletero\n"
                            +"6. Combustible\n"
                            +"7. Meses\n"
                            +"8. Velocidad\n"
                            +"9. Cambio");
                            int option = sc.nextInt();
                            switch(option){
                                case 1:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((NEV) autos.get(carro)).setModelo(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 2:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((NEV) autos.get(carro)).setVIN(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 3:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((NEV) autos.get(carro)).setCarroceria(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 4:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((NEV) autos.get(carro)).setPasajeros(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 5:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((NEV) autos.get(carro)).setMaletero(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 6:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((NEV) autos.get(carro)).setCombustible(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 7:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((NEV) autos.get(carro)).setMeses(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 8:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((NEV) autos.get(carro)).setVelocidad(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 9:{
                                    if (autos.get(carro) instanceof NEV) {
                                        System.out.println("Ingrese opcion de cambio: \n"
                                                + "1. Mecanico\n"
                                                + "2. Automatico");
                                        int cambio = sc.nextInt();
                                        switch (cambio) {
                                            case 1: {
                                                tipo_cambio = "Mecanico";
                                                break;
                                            }
                                            case 2: {
                                                tipo_cambio = "Automatico";
                                            }

                                        }
                                        ((NEV) autos.get(carro)).setCambio(tipo_cambio);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    
                                }
                            }// fin switch option
                            break;
                        }case 2:{
                            System.out.println("Ingrese opcion a modificar: "
                            +"1. Modelo\n"
                            +"2. VIN\n"
                            +"3. Carroceria\n"
                            +"4. Pasajeros\n"
                            +"5. Maletero\n"
                            +"6. Bateria\n"
                            +"7. Motor");
                            int option = sc.nextInt();
                            switch(option){
                                case 1:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((HEV) autos.get(carro)).setModelo(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 2:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((HEV) autos.get(carro)).setVIN(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 3:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((HEV) autos.get(carro)).setCarroceria(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 4:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((HEV) autos.get(carro)).setPasajeros(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 5:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((HEV) autos.get(carro)).setMaletero(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 6:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((HEV) autos.get(carro)).setBateria(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 7:{
                                    if (autos.get(carro) instanceof HEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((HEV) autos.get(carro)).setMotor(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                   
                                }
                            }
                            
                            break;
                        }case 3:{
                            System.out.println("Ingrese opcion a modificar:\n"
                            +"1. Modelo\n"
                            +"2. VIN\n"
                            +"3. Carroceria\n"
                            +"4. Pasajeros\n"
                            +"5. Maletero\n"
                            +"6. Kilometros\n"
                            +"7. Motores\n"
                            +"8. Remolque\n"
                            +"9. 4x4");
                            int option = sc.nextInt();
                            switch(option){
                                case 1:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((PHEV) autos.get(carro)).setModelo(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 2:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((PHEV) autos.get(carro)).setVIN(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 3:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((PHEV) autos.get(carro)).setCarroceria(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                    break;
                                }case 4:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((PHEV) autos.get(carro)).setPasajeros(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 5:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((PHEV) autos.get(carro)).setMaletero(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 6:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((PHEV) autos.get(carro)).setKilometros(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 7:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((PHEV) autos.get(carro)).setMotores(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 8:{
                                    if (autos.get(carro) instanceof PHEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((PHEV) autos.get(carro)).setRemolque(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 9:{
                                    if (autos.get(carro) instanceof PHEV) {
                                    System.out.println("4x4? [S]/[N]");
                                    char capacidad = sc.next().charAt(0);
                                    while (capacidad != 'S' && capacidad != 'N') {
                                        System.out.println("4x4? [S]/[N]");
                                        capacidad = sc.next().charAt(0);
                                    }
                                    if (capacidad == 'S') {
                                        cuatro = "Si";
                                    } else {
                                        cuatro = "No";
                                    }
                                    

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    ((PHEV) autos.get(carro)).setCarroceria(cuatro);
                                }
                            }
                            
                            break;
                        }case 4:{
                            System.out.println("Ingrese opcion a modificar: "
                            +"1. Modelo\n"
                            +"2. VIN\n"
                            +"3. Carroceria\n"
                            +"4. Pasajeros\n"
                            +"5. Maletero\n"
                            +"6. Kilometros\n"
                            +"7. Baterias\n"
                            +"8. Aceleracion\n"
                            +"9. Carga");
                            int option = sc.nextInt();
                            switch(option){
                                case 1:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((BEV) autos.get(carro)).setModelo(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 2:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((BEV) autos.get(carro)).setVIN(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 3:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        sc.nextLine();
                                        String nombre = sc.nextLine();

                                        ((BEV) autos.get(carro)).setCarroceria(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 4:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((BEV) autos.get(carro)).setPasajeros(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 5:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((BEV) autos.get(carro)).setMaletero(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 6:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((BEV) autos.get(carro)).setKilometros(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 7:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((BEV) autos.get(carro)).setBaterias(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 8:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((BEV) autos.get(carro)).setAceleracion(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    break;
                                }case 9:{
                                    if (autos.get(carro) instanceof BEV) {
                                        System.out.println("Ingrese");
                                        
                                        int nombre = sc.nextInt();

                                        ((BEV) autos.get(carro)).setCarga(nombre);

                                    } else {
                                        System.out.println("No es posible");
                                    }
                                    
                                }
                            }
                            
                        }
                    }//fin switch tipo
                    
                    break;
                }case 4:{
                    System.out.println("Ingrese carro a eliminar: ");
                    for(int i =0; i<autos.size();i++){
                        System.out.println((i)+". "+autos.get(i).getModelo());
                    }
                    int eliminar = sc.nextInt();
                    autos.remove(eliminar);
                    break;
                }case 5:{ // el programa pregunta que carro voy a calcular
                    
                    for (int i = 0; i < autos.size(); i++) {
                        System.out.println((i) + ". " + autos.get(i).getModelo());
                    }
                    int car = sc.nextInt();
                    
                try {// la excepcion
                    System.out.println(autos.get(car).calculo()+" dias.");
                    int ddias = autos.get(car).calculo();
                    dias = ddias;
                } catch (miExcepcion ex) {
                    System.out.println(ex.getMessage());
                }
                if(dias <= 30){// aqui pido otra vez los valores
                    
                    switch (autos.get(car).getTipo()) {
                        case 1: {
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            ((NEV) autos.get(car)).setPasajeros(pasajeros);
                            System.out.println("Ingrese combustible: ");
                            int combustible = sc.nextInt();
                            ((NEV) autos.get(car)).setCombustible(combustible);
                            System.out.println("Ingrese meses que dura el aceite: ");
                            int aceite = sc.nextInt();
                            ((NEV) autos.get(car)).setMeses(aceite);
                            
                            
                            break;
                        }
                        case 2: {
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            ((HEV) autos.get(car)).setPasajeros(pasajeros);
                            System.out.println("Ingrese maletero: ");
                            int combustible = sc.nextInt();
                            ((HEV) autos.get(car)).setMaletero(combustible);
                            System.out.println("Ingrese bateria: ");
                            int aceite = sc.nextInt();
                            ((HEV) autos.get(car)).setBateria(aceite);

                            
                            

                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            ((PHEV) autos.get(car)).setPasajeros(pasajeros);

                            System.out.println("Ingrese kilometros: ");
                            int combustible = sc.nextInt();
                            ((PHEV) autos.get(car)).setKilometros(combustible);
                            System.out.println("Ingrese motores: ");
                            int aceite = sc.nextInt();
                            ((PHEV) autos.get(car)).setMotores(aceite);
                            System.out.println("Ingrese remolque: ");
                            int aceitee = sc.nextInt();
                            ((PHEV) autos.get(car)).setRemolque(aceitee);
                            
                            
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese pasajeros: ");
                            int pasajeros = sc.nextInt();
                            ((BEV) autos.get(car)).setPasajeros(pasajeros);
                            System.out.println("Ingrese baterias: ");
                            int combustible = sc.nextInt();
                            ((BEV) autos.get(car)).setBaterias(combustible);
                            System.out.println("Ingrese aceleracion: ");
                            int aceite = sc.nextInt();
                            ((BEV) autos.get(car)).setAceleracion(aceite);
                            System.out.println("Ingrese carga: ");
                            int aceitee = sc.nextInt();
                            ((BEV) autos.get(car)).setCarga(aceitee);
                            
                            
                        }
                        
                    }
                }
                /* basicamente pido los valores otra vez y el programa
                los modifica, para volver a hacer el calculo solo tendrias 
                que volver a ingresar a la opcion 5 y ya daria :)
                */
                    

                    
                    
                }// fin case 5
// fin case 5
            }
            System.out.println("1. Agregar Auto\n"
                    + "2. Listar\n"
                    + "3. Modificar\n"
                    + "4. Eliminar\n"
                    + "5. Calculo\n"
                    + "6. Salir");
            opcion = sc.nextInt();// fin switch general 

        }// fin while general
    }// main
    
    // todo este doc es porque la vez pasada tuve un relajo de { y de } xd
    
}
