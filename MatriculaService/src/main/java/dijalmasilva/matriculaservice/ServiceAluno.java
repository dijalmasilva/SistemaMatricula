/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.matriculaservice;

import dijalmasilva.matriculacore.entidades.Aluno;
import dijalmasilva.matriculacore.jpa.AlunoDao;
import dijalmasilva.matriculacore.jpa.AlunoDaoImpl;
import dijalmasilva.matriculacore.validacao.ValidaAluno;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class ServiceAluno {

    public String salvarAluno(Aluno a){
        
        ValidaAluno validar = new ValidaAluno(a);
        String validacao = validar.isValido();
        if (!validacao.equals("")){
            return validacao;
        }
        
        AlunoDao dao = new AlunoDaoImpl();
        boolean result = dao.save(a);
        if (result){
            return "Aluno cadastrado com sucesso!";
        }else{
            return "CPF inválido ou já cadastrado!";
        }
    }
    
    public List<Aluno> listarTodos(){
        AlunoDao dao = new AlunoDaoImpl();
        return dao.findAll();
    }
}
