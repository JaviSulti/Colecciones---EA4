
package coo.ea4.Utilidades;

import coo.ea4.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuracion().compareTo(t.getDuracion());

        }
    };

    public static Comparator<Pelicula> ordenarDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuracion().compareTo(t1.getDuracion());

        }
    };

    public static Comparator <Pelicula> ordenarPorTitulo = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
            
        }
    };
    
    public static Comparator <Pelicula> ordenarPorDirector = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
            
        }
    };
    
}
