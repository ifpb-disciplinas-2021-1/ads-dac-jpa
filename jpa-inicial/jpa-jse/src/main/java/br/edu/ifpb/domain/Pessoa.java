package br.edu.ifpb.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/08/2021, 08:22:09
 */
@Entity
public class Pessoa implements Serializable{

    @Column(name = "nome")
    private String nomeFantasia;
    @Id
    private String cpf; //identidade
    private int idade;
    
    public Pessoa() {
    }

    public Pessoa(String nome,String cpf, int idade) {
        this.nomeFantasia = nome;
        this.cpf = cpf;
        this.idade =idade;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
//    public void salvar(Pessoa pessoa){ //mapeamento
//        // pessoa -> sql
//        // INSERT INTO pessoa VALUES (?,?)
//    }
//    
//    public Pessoa localizar( long id){
//        // sql -> pessoa
//        // SELECT * FROM pessoa WHERE codigo=?
//        return new Pessoa();
//    }
 
    
}

/**  
 * Pessoa
 idade | nome | cpf
 
 */