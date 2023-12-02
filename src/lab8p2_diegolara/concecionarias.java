/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class concecionarias implements Serializable {

    private String nombre;
    private String loc;
    private ArrayList<Carro> carro = new ArrayList();
    public static final long serialUID = 777l;

    public concecionarias(String nombre, String locación) {
        this.nombre = nombre;
        this.loc = locación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocación() {
        return loc;
    }

    public void setLocación(String locación) {
        this.loc = locación;
    }

    public ArrayList<Carro> getCarro() {
        return carro;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre;
    }

}
