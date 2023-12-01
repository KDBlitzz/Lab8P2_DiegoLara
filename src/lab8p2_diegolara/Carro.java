/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diego
 */
public class Carro {

    private String tipo;
    private String marca;
    private String modelo;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList();
    private String pais;
    private Date fecha = new Date();
    private int Horsep;
    private int velodidadp;
    private int tiempo;
    private ArrayList<Parte> partes = new ArrayList();

    public Carro() {
    }

    public Carro(String tipo, String marca, String modelo, Color color, double precio, String pais, Date fecha, int Horsep, int velodidadp, int tiempo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.pais = pais;
        this.Horsep = Horsep;
        this.velodidadp = velodidadp;
        this.tiempo = tiempo;
        this.fecha = fecha;
    }

    public int getHorsep() {
        return Horsep;
    }

    public void setHorsep(int Horsep) {
        this.Horsep = Horsep;
    }

    public int getVelodidadp() {
        return velodidadp;
    }

    public void setVelodidadp(int velodidadp) {
        this.velodidadp = velodidadp;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String isTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
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
}
