package org.webp;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CustomerEJB {

    @PersistenceContext
    private EntityManager em;

    public void createCustomer(Customer customer) {
        em.persist(customer);
    }

    public Customer findcustomerById(Long publisherId) {
        return em.find(Publisher.class, customerId);
    }

    public void updateCustomer(Customer customer) {
        em.merge(customer);
    }

    public void deleteCustomer(Long customerId) {
        Customer customer = em.find(Customer.class, customerId);
        em.remove(customer);
    }
}
