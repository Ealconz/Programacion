/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import enumeracion.Continentes;
import enumeracion.Dias;
import enumeracion.Juegos;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("mi primer dia de la semana es: " + Dias.LUNES);
        
        DiaSemana(Dias.MARTES);
        
        //Asignacion directa a traves de num
        Dias miDia = Dias.JUEVES;
        //Asignacion de un dia en base a un String a traves de valueOF
        Dias miSegundoDia = Dias.valueOf("VIERNES");
        // Declaracion  de un listado de dias inicializado con los values de Enum
        Dias[] todosMisDias = Dias.values();
        //imprimo el contenido de mi listado de dias
        for(Dias d: todosMisDias){
            System.out.println("d= " +d.name());
        }
        
        //Visualizando un pais
        System.out.println("Continente..."+Continentes.AMERICA);
        System.out.println("Numero de paises de AMERICA: "+ Continentes.AMERICA.getNumPaises());
        
        //Visualizando juegos
        System.out.println("Juego " + Juegos.Shooter);
        System.out.println("Numero de ventas de juegos Shooter: " + Juegos.Shooter.getVentas());
        
    
    }

    public static void DiaSemana(Dias Dias){
        switch (Dias){
                case LUNES:
                    System.out.println("Primer dia de la semana: ");
                    break;
                case MARTES:
                    System.out.println("Segundo dia de la semana: ");
                    break;
                case MIERCOLES:
                    System.out.println("Tercer dia de la semana: ");
                    break;
                case JUEVES:
                    System.out.println("Cuarto dia de la semana: ");
                    break;
                case VIERNES:
                    System.out.println("Quinto dia de la semana: ");
                    break;
                case SABADO:
                    System.out.println("Sexto dia de la semana: ");
                    break;
                case DOMINGO:
                    System.out.println("Septimo dia de la semana: ");
                    break;
                    
        }
    }
}
