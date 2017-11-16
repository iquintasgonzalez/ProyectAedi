/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ipgonzalez2_ESEI
 */
public interface Map<K,V> {
    //public Map();
    //Produce:mapa vacío
    //public Map(int capacidad);
    //Produce:mapa de capacidad
    public boolean esVacio();
    //Produce:Devuelve true si el mapa está vacío y falso en caso contrario.
    public int tamaño();
    //Produce: devuelve el numero de claves
    public boolean esta(K clave);
    //Produce: Devuelve true si la clave está en el mapa y falso en caso contrario.
    public V getValor(K clave);
    //Produce: Devuelve el valor que se corresponde con la clave K o null si la clave no esta
    public void insertar(K clave,V valor);
    //Modifica:this
    //Produce: Añade el par clave/valor al mapa.Si la clave estuviese presente ya sustituye el
    // valor anterior.
    public V eliminar(K clave);
    //Modifica:this
    //Produce: elimina la clave y su valor asociado en el mapa.Devuelve el valor previamente asociado
    //a la clave o null si la clave no estuviese.
    public void suprimir();
    //Modifica:this
    //Produce:Elimina todos los elementos
    public List<K> getClaves();
    //Produce: Devuelve las claves del mapa.
    public List<V> getValores();
    //Produce: Devuelve los valores del mapa.
    
}
