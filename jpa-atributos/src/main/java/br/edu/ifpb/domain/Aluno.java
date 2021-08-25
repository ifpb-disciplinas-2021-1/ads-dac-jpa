package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nome_do_aluno")
    private String nome;
    @Column(length = 15, unique = true)
    private String matricula; // 15 caracteres
//    private CPF cpf;

    @Temporal(TemporalType.DATE)
    private Date dataDaMatricula;

    public Aluno() {
        this.dataDaMatricula = new Date();
    }

    public Aluno(String nome, String matricula) {
        this();
        this.nome = nome;
        this.matricula = matricula;
    }
}

