import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ControladorDeClientes {

    @Inject
    private Clientes clientes;
    private Cliente cliente = new Cliente();

    public String salvar() {
        try {
            clientes.novo(cliente);
            cliente = new Cliente();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Cliente> getTodosOsClientes() {
        return clientes.todos();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
