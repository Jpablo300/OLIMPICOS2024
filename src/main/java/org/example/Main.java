package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        // PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        //MEDALLAS DE ORO
        // MEDALLAS DE PLATA
        //MEDALLAS DE BRONCES

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        //IMFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS

        // TERMINANDO SUMAR EL TOTAL DE MEDALLAS DE LOS PAISES
        //SURAMERICANOS

        //////////////////////////////////////////////////////////////////

        ArrayList<String> paises=new ArrayList<>();
        ArrayList<Integer> medallas=new ArrayList<>();

        Scanner leerTeclado=new Scanner(System.in);

        System.out.println("***OLIMPICOS 2024***");
        for(int i=0; i<3; i++){
            String pais;
            int sumatoriaMedallas=0;
            System.out.print("Ingrese un pais: ");
            pais=leerTeclado.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE CADA PAIS
            System.out.print("Digita el numero de medallas de oro de "+pais+": ");
            int medallaOro=leerTeclado.nextInt();
            System.out.print("Digita el numero de medallas de plata de "+pais+": ");
            int medallaPlata=leerTeclado.nextInt();
            System.out.print("Digita el numero de medallas de bronce de "+pais+": ");
            int medallaBronce=leerTeclado.nextInt();
            sumatoriaMedallas=medallaOro+medallaPlata+medallaBronce;
            System.out.print("obtuvo en total: "+sumatoriaMedallas+"Medallas en Paris");
            leerTeclado.nextLine();

            medallas.add(sumatoriaMedallas);



        }
        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);
        System.out.println("El pais con mas medallas obtuvo un totla de medalla "+paisMayor);
        for(int medalla:medallas) {

            if (medalla>paisMayor){
                paisMayor=medalla;
            }
        }
        System.out.println("El pais con mas medallas ovtubo en total de: "+paisMayor);


        //  quiero preguntar cual es el cajon (indice) donde se guardo
        // la cantidad de medallas mayor
        int indiceGanador=medallas.indexOf(paisMayor);
        System.out.println("El indice ganador es el: "+indiceGanador);
        //QUIERO OBTENER EL VALOR QUE HAY DENTRO DEL CAJON
        System.out.println("Asi pues, el pais ganador fue: "+paises.get(indiceGanador));




    }
}