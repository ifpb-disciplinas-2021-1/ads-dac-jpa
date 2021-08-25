package br.edu.ifpb.infra;

import br.edu.ifpb.domain.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/08/2021, 09:09:49
 */
@Stateless
public class Clientes {
    
    @PersistenceContext
    private EntityManager manager;
    
    public Cliente salvar(Cliente cliente){
        manager.persist(cliente);
        return cliente;
    }
    public List<Cliente> todos(){
        return manager.createQuery("FROM Cliente c",Cliente.class)
            .getResultList();
    }
}
