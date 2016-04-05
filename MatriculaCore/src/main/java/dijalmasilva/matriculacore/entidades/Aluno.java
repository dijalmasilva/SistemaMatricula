/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.matriculacore.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
@Entity
public class Aluno implements Serializable {

    @Column(length = 150)
    private final String nomeCompleto;
    private final LocalDate dataNascimento;
    @Column(length = 60)
    private final String nacionalidade;
    @Column(length = 30)
    private final String identidade;
    @Column(length = 10)
    private final String orgaoEmissor;
    @Id
    @CPF
    @Column(length = 14)
    private final String cpf;
    @Column(length = 30)
    private final String reservista;
    private final String sexo;

    public Aluno() {
        this.nomeCompleto = "";
        this.dataNascimento = null;
        this.nacionalidade = "";
        this.identidade = "";
        this.orgaoEmissor = "";
        this.cpf = "";
        this.reservista = "";
        this.sexo = "";
    }

    public Aluno(String nomeCompleto, LocalDate dataNascimento, String nacionalidade, String identidade, String orgaoEmissor, String cpf, String reservista, String sexo) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.identidade = identidade;
        this.orgaoEmissor = orgaoEmissor;
        this.cpf = cpf;
        this.reservista = reservista;
        this.sexo = sexo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public String getCpf() {
        return cpf;
    }

    public String getReservista() {
        return reservista;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nomeCompleto=" + nomeCompleto + ", dataNascimento=" + dataNascimento + ", nacionalidade=" + nacionalidade + ", identidade=" + identidade + ", orgaoEmissor=" + orgaoEmissor + ", cpf=" + cpf + ", reservista=" + reservista + '}';
    }
}
