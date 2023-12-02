/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegolara;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author diego
 */
public class Comprapg extends Thread {

    private JProgressBar prog = new JProgressBar();
    private int cont = 0;
    private boolean flag = true;

    public JProgressBar getProg() {
        return prog;
    }

    public void setProg(JProgressBar prog) {
        this.prog = prog;
    }

    @Override
    public void run() {
        while (flag) {
            cont++;
            prog.setValue(cont);
            if (cont > 10) {
                flag = false;
                prog.setValue(0);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Comprapg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
