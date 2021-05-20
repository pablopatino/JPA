
package test;

import clases.Persona;
import javax.persistence.*;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;

public class main {
    
   static Logger log = LogManager.getRootLogger();
   
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        
        Persona persona1 = new Persona("Juan","Alberto","corro@oemail.com","66666343");
        log.debug("Objeto a persistir " + persona1);
        
        em.persist(persona1);  
        tx.commit();
        
        em.close();
    }
    
}
