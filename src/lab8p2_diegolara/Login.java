/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

/**
 *
 * @author diego
 */
public class Login extends Thread {

    private JProgressBar prog = new JProgressBar();
    private ArrayList<jugador> lista = new ArrayList();
    private JDialog cargar = new JDialog();
    private JDialog crud = new JDialog();

    private boolean flag = true;
    private int cont = 0;

    public Login() {
    }

    public JProgressBar getProg() {
        return prog;
    }

    public void setProg(JProgressBar prog) {
        this.prog = prog;
    }

    public ArrayList<jugador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<jugador> lista) {
        this.lista = lista;
    }

    public JDialog getCargar() {
        return cargar;
    }

    public void setCargar(JDialog cargar) {
        this.cargar = cargar;
    }

    public JDialog getCrud() {
        return crud;
    }

    public void setCrud(JDialog crud) {
        this.crud = crud;
    }

    @Override
    public void run() {
        prog.setValue(0);
        cont = 0;
        while (flag) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            prog.setValue(cont);
            if (cont > lista.size()) {
                flag = false;
                cargar.setVisible(false);
                crud.pack();
                crud.setVisible(true);
                prog.setValue(0);
                return;
            }

            cont++;
        }
        

    }
}
