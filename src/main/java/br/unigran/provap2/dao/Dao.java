
package br.unigran.provap2.dao;

import br.unigran.provap2.model.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Dao {
    
    protected final EntityManagerFactory nome = Persistence.createEntityManagerFactory("br.unigran_ProvaP2_jar_1.0-SNAPSHOTPU");
    protected final EntityManager pac = nome.createEntityManager();
   
   
   public void salvar(Paciente paciente){ 
       pac.getTransaction().begin();
       pac.persist(paciente);
       pac.getTransaction().commit(); //commit e get transaction serve para colocar um novo paciente no bd
       }
   public void atualizar(Long id){
       pac.getTransaction().begin(); 
       pac.merge(id); //merge é um metodo para atualizar um paciente existente no bd.
       pac.getTransaction();
   }
   
   /* método primeiro busca o paciente pelo seu id, se o paciente for encontrado ele inicia uma transação,
   remove o paciente do banco de dados*/
   public void deletar(Long id){
           pac.getTransaction();
           pac.remove(id);
           pac.getTransaction();
   }   
    
}
