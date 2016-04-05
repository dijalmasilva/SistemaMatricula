/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dijalmasilva.matriculacore.entidades;

import java.time.LocalDate;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class AlunoBuilder {

    private final String nomeCompleto;        //obrigatorio     
    private final LocalDate dataNascimento;   //obrigatorio
    private final String cpf;                 //obrigatorio
    private final String sexo;              //obrigatorio
    private String nacionalidade;       //opcional
    private String identidade;          //opcional
    private String orgaoEmissor;        //opcional
    private String reservista;          //opcional

    public AlunoBuilder(String nomeCompleto, LocalDate dataNascimento, String cpf, String sexo) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    
    public AlunoBuilder comNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
        return this;
    }
    
    public AlunoBuilder comIdentidade(String identidade, String orgaoEmissor){
        this.identidade = identidade;
        this.orgaoEmissor = orgaoEmissor;
        return this;
    }
    
    public AlunoBuilder comReservista(String reservista){
        this.reservista = reservista;
        return this;
    }
    
    public Aluno buildAluno(){
        return new Aluno(nomeCompleto, dataNascimento, nacionalidade, identidade, orgaoEmissor, cpf, reservista, sexo);
    }
}
