/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

import grafo.Grafo;
import grafo.Vertice;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ipgonzalez2_ESEI
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static <E> Map<Vertice<E>, String> colorearMapa(Grafo<E, Integer> g, String[] colores) {
        //erro porque el map vacio no esta implementado
        Map<Vertice<E>, String> Colores = new Map<>();

        //tienes que usar iterator porque el aed2.jar cuando g.vertices es iterator
        Iterator<Vertice<E>> ver = g.vertices();

        /*mientras exista siguiente lo coges y llamas a la funcion insertar 
        que le pasa ESE mismo vertice y como color "",asi hasta que no queden vertices*/
        while (ver.hasNext()) {
            Vertice<E> vert = ver.next();
            Colores.insertar(vert, new String());
        }

        //vuelves a rellenar el iterator ya que esta vacio al hacer el next arriba
        ver = g.vertices();

        /* copia y pega de arriba solo que en medio llamas a Color
        que es retorna un string con un color del array de colores*/
        while (ver.hasNext()) {
            Vertice<E> vert = ver.next();
            String eColor = color(Colores, colores, vert, g);
            //iserta en el map de que vas a visualizar el vertice dado y un color 
            Colores.insertar(vert, eColor);
        }
        //devuelves map con el mapa coloreado
        return Colores;
    }

    //funcion para dar color a un vertice
    /**
     * @return String
     * @param d par del vertice y el string (""|el color)
     * @param color array de colores
     * @param v vertice que le asignamos color
     * @param g el grafo para poder recoger adyacentes
     */
    private static <E> String color(Map<Vertice<E>, String> par, String[] color, Vertice<E> v, Grafo<E, Integer> g) {
        //se tiene que usar iterator ya que ella lo usa en el aed2
        Iterator<Vertice<E>> ad = g.adyacentes(v);
        //contador para recorrer el array de colores
        int cont = 0;
        //seleciona color 
        String pColor = color[cont];

        //comprobar si el adyacente tiene el mismo color 
        while (ad.hasNext()) {
            Vertice<E> vert = ad.next();

            //si es que si que avance de color
            if (par.getValor(vert).equals(color)) {
                pColor = color[++cont];
            }
        }
        //si es que no se asigna el color 
        return pColor;
    }
}
