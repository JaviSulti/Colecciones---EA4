package coo.ea4;

import coo.ea4.Entidades.Pelicula;
import coo.ea4.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class COOEA4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido a su Filmoteca. Por favor, lea atentamente las instrucciones.");
        int i = 1;

        ArrayList<Pelicula> filmoteca = new ArrayList();

        do {
            System.out.println("------------------------------------------------------------");
            Pelicula p1 = new Pelicula();
            System.out.print("Ingrese el titulo de la pelicula " + i + " > ");
            p1.setTitulo(teclado.next());
            System.out.print("Ingrese el nombre del director de la pelicula " + p1.getTitulo() + " > ");
            p1.setDirector(teclado.next());
            System.out.print("Ingrese la duracion en horas de la pelicula " + p1.getTitulo() + " > ");
            p1.setDuracion(teclado.nextDouble());
            System.out.println("------------------------------------------------------------");

            filmoteca.add(p1);
            i++;

            System.out.print("Si desea ingresar una nueva pelicula, por favor, indique SI, de lo contrario, indique NO > ");

        } while (teclado.next().equalsIgnoreCase("SI"));

        System.out.println("------------------------------------------------------------");
        System.out.println("Las peliculas ingresadas hasta el momento son: ");
        for (int j = 0; j < filmoteca.size(); j++) {
            System.out.println(" ********** Pelicula " + (j + 1) + " ********** ");
            System.out.println("Titulo > " + filmoteca.get(j).getTitulo() + ". Director > " + filmoteca.get(j).getDirector() + ". Duracion > " + filmoteca.get(j).getDuracion());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Todas aquellas peliculas cuya duracion es mayor a una hora son: ");
        for (int j = 0; j < filmoteca.size(); j++) {
            if (filmoteca.get(j).getDuracion() > 1) {
                System.out.println(" ********** Pelicula " + (j + 1) + " ********** ");
                System.out.println("Titulo > " + filmoteca.get(j).getTitulo() + ". Director > " + filmoteca.get(j).getDirector() + ". Duracion > " + filmoteca.get(j).getDuracion());
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas segun su duracion descendete son: ");

        Collections.sort(filmoteca, Comparadores.ordenarDuracionDescendente);
        for (int j = 0; j < filmoteca.size(); j++) {
            System.out.println(" ********** Pelicula " + (j + 1) + " ********** ");
            System.out.println("Titulo > " + filmoteca.get(j).getTitulo() + ". Director > " + filmoteca.get(j).getDirector() + ". Duracion > " + filmoteca.get(j).getDuracion());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas segun su duracion ascendente son: ");

        Collections.sort(filmoteca, Comparadores.ordenarDuracionAscendente);
        for (int j = 0; j < filmoteca.size(); j++) {
            System.out.println(" ********** Pelicula " + (j + 1) + " ********** ");
            System.out.println("Titulo > " + filmoteca.get(j).getTitulo() + ". Director > " + filmoteca.get(j).getDirector() + ". Duracion > " + filmoteca.get(j).getDuracion());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas alfabeticmanete por titulo son: ");

        Collections.sort(filmoteca, Comparadores.ordenarPorTitulo);
        for (int j = 0; j < filmoteca.size(); j++) {
            System.out.println(" ********** Pelicula " + (j + 1) + " ********** ");
            System.out.println("Titulo > " + filmoteca.get(j).getTitulo() + ". Director > " + filmoteca.get(j).getDirector() + ". Duracion > " + filmoteca.get(j).getDuracion());
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas alfabeticmanete por director son: ");

        Collections.sort(filmoteca, Comparadores.ordenarPorDirector);
        for (int j = 0; j < filmoteca.size(); j++) {
            System.out.println(" ********** Pelicula " + (j + 1) + " ********** ");
            System.out.println("Titulo > " + filmoteca.get(j).getTitulo() + ". Director > " + filmoteca.get(j).getDirector() + ". Duracion > " + filmoteca.get(j).getDuracion());
        }
        
    }

}
