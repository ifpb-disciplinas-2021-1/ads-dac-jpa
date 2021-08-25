package br.edu.ifpb.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Professor implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    @Temporal(TemporalType.DATE)
    private Date dataDeNascimento;
    // professor_emails <entidade_atributo>
    @CollectionTable(name = "emails")
    @ElementCollection
    private List<String> emails = new ArrayList<>();

    public Professor() {
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public  void novoEmail(String email){
        this.emails.add(email);
    }
}
