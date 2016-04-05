/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.matriculaviewdesktop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class ThreadDisponibilidade extends Thread{

    private CadastroAluno telaCadastro;

    public ThreadDisponibilidade(CadastroAluno telaCadastro) {
        this.telaCadastro = telaCadastro;
    }

    @Override
    public void run() {
        while (true) {            
            try {
                telaCadastro.verificaReservista();
                telaCadastro.verificaOrgaoEmissor();
                telaCadastro.verificaBotaoCadastro();
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDisponibilidade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
