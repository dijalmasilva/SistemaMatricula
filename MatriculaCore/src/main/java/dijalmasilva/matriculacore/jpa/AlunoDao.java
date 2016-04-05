/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.matriculacore.jpa;

import dijalmasilva.matriculacore.entidades.Aluno;
import java.util.List;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public interface AlunoDao {

    boolean save(Aluno a);
    
    List<Aluno> findAll();
}
