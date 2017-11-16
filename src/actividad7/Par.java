/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

/**
 *
 * @author ipgonzalez2_ESEI
 */
public interface Par<K,V> {
    public K getClave();
    //Produce: Devuelve la clave del par
    public V getValor();
    //Produce: devulve el valor del par
    public void setValor(V nuevo);
    //Modifica:this
    //Produce: Cambia el valor del par.
    
}
