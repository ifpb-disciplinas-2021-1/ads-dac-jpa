package br.edu.ifpb.main;

import br.edu.ifpb.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManager entityManager = Persistence
            .createEntityManagerFactory("ExemploPU")
            .createEntityManager();
        Endereco endereco = new Endereco(
          "rua do IF",
          "bairro do IF",
          "CZ"
        );
        Funcionario funcionario  =new Funcionario(
                "Job",
                "123",
                endereco // 1 -> 1
        );
        Dependente chaves = new Dependente("Chaves");
        Dependente kiko = new Dependente("Kiko");
        Departamento uninfo = new Departamento("UNINFO");
        Gerente gerente = new Gerente(
                "Leandro", "124"
        );

        Projeto dac = new Projeto("Projeto de DAC");
        Fornecedor job = new Fornecedor("Job", "TI");

        funcionario.novo(chaves);// 1 -> n
        funcionario.novo(kiko); // 1 -> n
        funcionario.setDepartamento(uninfo); //n -> 1
        dac.novo(job); // n -> n
        uninfo.setGerente(gerente); //1 -> 1
        gerente.setDepartamento(uninfo); //1 -> 1
        gerente.novo(dac); // 1 -> n (bidirecional)

//        funcionario.setEndereco(endereco);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(chaves);
        entityManager.persist(kiko);
        entityManager.persist(endereco);
        entityManager.persist(uninfo);
        entityManager.persist(funcionario);
        entityManager.persist(dac);
        entityManager.persist(job);
        entityManager.persist(gerente);
        transaction.commit();
    }
    

}
