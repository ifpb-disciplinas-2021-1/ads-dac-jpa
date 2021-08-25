package br.edu.ifpb.domain;

import br.edu.ifpb.domain.io.ImageFromFile;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Perfil implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nomeUsuario;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String descricao; // C-LOB
    @Lob
    @Basic(fetch = FetchType.EAGER)
    private byte[] foto; // B-LOB

    @Transient
    private ImageFromFile image;

    public Perfil() {
    }

    public Perfil(String nomeUsuario, String path) {
        this.nomeUsuario = nomeUsuario;
        this.image = new ImageFromFile(path);
        this.foto = image.toBytes();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
