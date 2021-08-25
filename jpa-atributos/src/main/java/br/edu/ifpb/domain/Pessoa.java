package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2021, 19:22:23
 */
@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // serial
    private String nome;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String toString() {
        return "Pessoa{ " + "id=" + id + ", nome=" + nome + '}';
    }    
}


