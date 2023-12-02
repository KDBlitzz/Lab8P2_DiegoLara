/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class AdminJugador {

    ArrayList<jugador> list = new ArrayList();
    private File archivo = null;

    public AdminJugador(String path) {
        archivo = new File(path);
    }

    public ArrayList<jugador> getList() {
        return list;
    }

    public void setList(ArrayList<jugador> list) {
        this.list = list;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setJugador(jugador j) {
        this.list.add(j);
    }
}
