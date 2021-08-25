package br.edu.ifpb.web;

import br.edu.ifpb.domain.Cliente;
import br.edu.ifpb.infra.Clientes;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/08/2021, 09:14:46
 */
@Named
@RequestScoped
public class ControladorDeClientes {

    @Inject
    private Clientes clientes;
    
    private Cliente cliente = new Cliente();
    
    public String salvar(){
        clientes.salvar(
            this.cliente
        );
        this.cliente = new Cliente();
        return null;
    }
    public List<Cliente> todosOsClientes(){
        return this.clientes.todos();
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
