package br.edu.ifpb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String area;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}
