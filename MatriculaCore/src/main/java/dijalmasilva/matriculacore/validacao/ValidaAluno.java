/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.matriculacore.validacao;

import dijalmasilva.matriculacore.entidades.Aluno;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class ValidaAluno {

    private final Aluno a;

    public ValidaAluno(Aluno a) {
        this.a = a;
    }
    
    public String isValido(){
        
        if (isNull())
            return "Aluno nulo!";
        
        if (!possuiDoisNomes())
            return "O aluno deve possuir pelo menos dois nomes válidos.";
        
        return "";
    }
    
    private boolean isNull(){
        return a == null;
    }
    
    private boolean possuiDoisNomes(){
        String[] split = a.getNomeCompleto().split(" ");
        if (split.length > 1){
            for (String nome : split) {
                if (nome.length() < 2){
                    return false;
                }
            }
        }else{
            return false;
        }
        
        return true;
    }
}
