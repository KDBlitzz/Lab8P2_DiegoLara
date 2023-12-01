/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class concecionarias {

    private String nombre;
    private String locación;
    private ArrayList<Carro> carro = new ArrayList();

    public concecionarias(String nombre, String locación) {
        this.nombre = nombre;
        this.locación = locación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocación() {
        return locación;
    }

    public void setLocación(String locación) {
        this.locación = locación;
    }

    public ArrayList<Carro> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }
    
}
