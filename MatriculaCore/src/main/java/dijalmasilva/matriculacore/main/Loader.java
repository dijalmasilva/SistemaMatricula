/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.matriculacore.main;

import dijalmasilva.matriculacore.entidades.Aluno;
import dijalmasilva.matriculacore.jpa.AlunoDao;
import dijalmasilva.matriculacore.jpa.AlunoDaoImpl;
import java.util.List;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {
        AlunoDao dao = new AlunoDaoImpl();
//        Aluno a = new AlunoBuilder("Manoel Dijalma da Silva Filho", LocalDate.now(), "120.300.054-18", String.MASCULINO)
//                .comIdentidade("3763218", "SSP").comNacionalidade("brasileiro").comReservista("2132132").buildAluno();
//        dao.save(a);
        List<Aluno> alunos = dao.findAll();
        
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
}
