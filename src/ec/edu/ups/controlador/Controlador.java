/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class Controlador <T>{
    private List<T> listaGenerica;
    
    /*
     private List<Cliente> clientes;
    private List<Cliente> enLaFila;
    private List<Cliente> fueraDeFila;
    private Random random;
    
    private Controlador() {
        clientes = new ArrayList<>();
        enLaFila = new ArrayList<>();
        fueraDeFila = new ArrayList<>();
        random = new Random();
    }
    
    public static Controlador getInstance() {
        return ControladorHolder.INSTANCE;
    }
    
    private static class ControladorHolder {
        private static final Controlador INSTANCE = new Controlador();
    }
    
    */
    
    public Controlador() {
        listaGenerica = new ArrayList<>();
    }
    
    public void create(T objeto) {
        listaGenerica.add(objeto);
    }
    
    public List<T> getListaGenerica() {
        return listaGenerica;
    }
    
    public void update(T objetoActalizado) {
        for (T objeto : listaGenerica) {
            if (objeto.equals(objetoActalizado)) {
                listaGenerica.set(listaGenerica.indexOf(objeto), objetoActalizado);
            }
        }
    }
}
