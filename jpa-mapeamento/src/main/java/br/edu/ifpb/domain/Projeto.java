package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Projeto implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String descricao;
    // MUITOS Projetos pode ser financiados por MUITOS Fornecedores
    @ManyToMany // N -> N unidirecional
    //    <entidade_fonte_entidade_alvo> --> entidade-fonte_id-entidade_fonte
    @JoinTable(name="Financiadores")
    private List<Fornecedor> fornecedores = new ArrayList<>();
    // MUITOS Projetos são coordenados por UM Gerente
    // N -> 1 bidirecional (possuídora)
    @ManyToOne
    private  Gerente gerente;

    // MUITOS Projetos trabalham MUITOS Funcionarios
    // N -> N bidirecional (possuídora)
//    @ManyToMany
//    private List<Funcionario> funcionarios = new ArrayList<>();

    public Projeto() {
    }
    public Projeto(String descricao) {
        this.descricao = descricao;
    }

//    public void novo(Funcionario funcionario) {this.funcionarios.add(funcionario);}
    public void novo(Fornecedor fornecedor) {this.fornecedores.add(fornecedor);}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Fornecedor> getFornecedores() {

        return Collections.unmodifiableList(
                fornecedores
        );
    }
    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    public Gerente getGerente() {
        return gerente;
    }
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
