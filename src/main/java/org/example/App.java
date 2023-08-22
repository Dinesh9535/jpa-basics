package org.example;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Valtech emp1 = new Valtech();
        emp1.setId(122);                //creating a new record/row
        emp1.setAge(34);
        emp1.setEname("dhanush");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbUnit");
        EntityManager em = emf.createEntityManager();
        System.out.println( "Hello World!" );

        em.getTransaction().begin();     //opening the db connection
        em.persist(emp1);               //saving it in the db
        em.getTransaction().commit();   //permanently saving in db and close the connection

        Valtech v = em.find(Valtech.class,122);         //fetching data from db
        System.out.println(v);
    }
}