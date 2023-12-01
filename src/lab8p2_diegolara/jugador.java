/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class jugador {

    private String nombre;
    private String correo;
    private String pais;
    private double cash = 150000;
    ArrayList<Carro> playercars = new ArrayList();
    Date fecha = new Date();
    private String pass;
    private String user;

    public jugador() {
    }

    public jugador(String nombre, String correo, String pais, Date fecha, String pass, String user) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.fecha = fecha;
        this.pass = pass;
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ArrayList<Carro> getPlayercars() {
        return playercars;
    }

    public void setPlayercars(ArrayList<Carro> playercars) {
        this.playercars = playercars;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
