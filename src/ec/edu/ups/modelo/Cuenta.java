/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.vista.VentanaPrincipal;

/**
 *
 * @author ASUS
 */
public class Cuenta {
    private int saldo;
    private int saldoInicial;
    private VentanaPrincipal ventanaPrincipal;
    private int saldoFinal;

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public int getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(int saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Cuenta(int saldo){
        this.saldoInicial=saldo;
        this.saldo=saldo;
    }
    public synchronized void hacerMovimiento(int cantidad){
        this.saldo = this.saldo+cantidad;
        //ventanaPrincipal.cargarDatos();
    }
    public boolean esSimulacionCorrecta(){
        if (this.saldo==this.saldoInicial) return true;
        return false;
    }
    public int getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", saldoInicial=" + saldoInicial
                + ", ventanaPrincipal=" + ventanaPrincipal + ", saldoFinal=" + saldoFinal + '}';
    }

   
    
}
