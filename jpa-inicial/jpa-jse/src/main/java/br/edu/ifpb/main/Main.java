package br.edu.ifpb.main;

import br.edu.ifpb.domain.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/08/2021, 08:42:29
 */
public class Main {
    public static void main(String[] args) {
        EntityManager manager = Persistence
            .createEntityManagerFactory("ExemploDerby")
            .createEntityManager();
        EntityTransaction transacao = manager.getTransaction();
        
//        Pessoa pessoa = new Pessoa(
//            "Ricardo","123",33
//        );
//        
//        transacao.begin(); //ACID
//        manager.persist(pessoa);
//        transacao.commit();
        Pessoa retorno = manager.find(Pessoa.class,"123");
        System.out.println("Nome: "+retorno.getNomeFantasia());
    }
}
