

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Consumidor")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nomefantasia")
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(int id,String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
