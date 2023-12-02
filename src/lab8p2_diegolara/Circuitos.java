/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.io.Serializable;

/**
 *
 * @author diego
 */
public class Circuitos implements Serializable {

    private int logitud;
    private int cant;
    private String tipo;
    private String loc;
    public static final long serialUID = 777l;

    public Circuitos() {
    }

    public Circuitos(int logitud, int cant, String tipo, String loc) {
        this.logitud = logitud;
        this.cant = cant;
        this.tipo = tipo;
        this.loc = loc;
    }

    public int getLogitud() {
        return logitud;
    }

    public void setLogitud(int logitud) {
        this.logitud = logitud;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo;
    }

}
