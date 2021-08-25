package br.edu.ifpb.main;


import br.edu.ifpb.domain.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 21/08/2021, 19:33:24
 */
public class Main {

    public static void main(String[] args) {
        EntityManager entityManager = Persistence
            .createEntityManagerFactory("ExemploPU")
            .createEntityManager();
//        persistirAluno(entityManager);
        persistirProfessor(entityManager);
//persistirPessoa(entityManager);
//        persistirPerfil(entityManager);

//        Perfil perfil = entityManager.find(Perfil.class, 1);
//        System.out.println(perfil.getDescricao());
    }
    private static void persistirAluno(EntityManager entityManager) {

        Aluno aluno = new Aluno(
                "Ana Maria", "124"
        );
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(
            aluno
        );
        transaction.commit();
    }
    private static void persistirPessoa(EntityManager entityManager) {
//        Pessoa pessoa  = new Pessoa(
//                "Job",
//                Sexo.MASCULINO
//        );
        Pessoa pessoa  = new Pessoa(
                "Ana",
                Sexo.FEMININO
        );
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(pessoa);
        transaction.commit();
    }
    private static void persistirProfessor(EntityManager entityManager) {
        Professor professor = new Professor(
                "Job"
        );
        professor.novoEmail("ricardo.job@ifpb.edu.br");
        professor.novoEmail("sousajob@gmail.com");
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(professor);
        transaction.commit();
    }
    private static void persistirPerfil(EntityManager entityManager) {
        Perfil perfil = new Perfil(
            "ricardojob",
                "src/main/resources/imagens/job.jpg"
        );
        perfil.setDescricao("objc[10201]: Class JavaLaunchHelper is implemented in both /" +
                "Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home" +
                "/bin/java (0x107e584c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_" +
                "25.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x107ed14e0). " +
                "One of the two will be used. Which one is undefined.\n" +
                "[EL Info]: 2021-08-24 09:04:15.492--ServerSession(49" +
                "4266287)--EclipseLink, version: Eclipse Persistence " +
                "Services - 2.5.2.v20140319-9ad6abd\n" +
                "[EL Info]: connection: 2021-08-24 09:04:17.238--Serve" +
                "rSession(494266287)--file:/Users/job/Documents/dev/ifpb/2021-1" +
                "Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home" +
                "/bin/java (0x107e584c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_" +
                "25.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x107ed14e0). " +
                "One of the two will be used. Which one is undefined.\n" +
                "[EL Info]: 2021-08-24 09:04:15.492--ServerSession(49" +
                "4266287)--EclipseLink, version: Eclipse Persistence " +
                "Services - 2.5.2.v20140319-9ad6abd\n" +
                "[EL Info]: connection: 2021-08-24 09:04:17.238--Serve" +
                "rSession(494266287)--file:/Users/job/Documents/dev/ifpb/2021-1" +
                "Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home" +
                "/bin/java (0x107e584c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_" +
                "25.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x107ed14e0). " +
                "One of the two will be used. Which one is undefined.\n" +
                "[EL Info]: 2021-08-24 09:04:15.492--ServerSession(49" +
                "4266287)--EclipseLink, version: Eclipse Persistence " +
                "Services - 2.5.2.v20140319-9ad6abd\n" +
                "[EL Info]: connection: 2021-08-24 09:04:17.238--Serve" +
                "rSession(494266287)--file:/Users/job/Documents/dev/ifpb/2021-1" +
                "/ads-dac-jpa/jpa-atributos/target/classes/_ExemploPU login successful ---111\n");
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(perfil);
        transaction.commit();
    }
    private static void persistirTelefone(EntityManager entityManager) {

    }
    private static void listarPessoas(EntityManager entityManager) {

    }
    private static void listarTelefone(EntityManager entityManager) {
    }

}
