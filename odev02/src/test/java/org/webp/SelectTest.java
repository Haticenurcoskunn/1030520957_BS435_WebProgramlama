package org.webp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectTest {

    private EntityManagerFactory factory;
    private EntityManager em;

    @BeforeEach
    public void init() {
        //BeforeEach her testten sonra calıştırılır
        factory = Persistence.createEntityManagerFactory("Hibernate");
        em = factory.createEntityManager();
    }

    @AfterEach
    public void tearDown() {
        //AfterEach her testten sonra calıştırılır
        em.close();
        factory.close();
    }

    private boolean persistInATransaction(Object obj) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("FAILED TRANSACTION: " + e.toString());
            tx.rollback();
            return false;
        }

        return true;
    }


    @Test
    public void selectBook() {

        Book book = new Book();
        book.setBookId(1L);
        book.setPrice(100);
        book.setName("Satranç");
        book.setCategory("Kurgu");
        book.setSellerCompanyId(2L);

        boolean persisted = persistInATransaction(book);
        assertTrue(persisted);
    }

    @Test
    public void selectSellerCompany() {

        SellerCompany sellerCompany = new SellerCompany();
        sellerCompany.setId(2L);
        sellerCompany.setName("D&R");
        .setcustomerId(2L);

        boolean persisted = persistInATransaction(sellerCompany);
        assertTrue(persisted);
    }

    @Test
    public void selectCustomer() {

        Customer customer = new Customer();
        customer.setCustomerId(2L);
        customer.setName("Hatice Nur Coşkun");

        boolean persisted = persistInATransaction(customer);
        assertTrue(customer);
    }

}
