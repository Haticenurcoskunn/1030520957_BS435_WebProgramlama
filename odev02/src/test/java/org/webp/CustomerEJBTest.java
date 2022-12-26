package org.webp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomerEJBTest {

    private CustomerEJB customerEJB = new CustomerEJB();

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setName("Hatice Nur Coşkun");
        customerEJB.createPublisher(customer);
        Customer foundCustomer = customerEJB.findCustomerById(1L);
        assertEquals(customer, foundCustomer);
    }

    @Test
    public void testUpdateCustomer() {
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setName("Hatice Nur Coşkun");
        customerEJB.createCustomer(customer);
        customer.setName("Merve Usta");
        customerEJB.updateCustomer(customer);
        Customer foundCustomer = customerEJB.findCustomerById(1L);
        assertEquals("Merve Usta", foundCustomer.getName());
    }

    public void testDeleteCustomer() {
        Customer customer = new Customer();
        customer.setCustomerId(1L);
        customer.setName("Hatice Nur Coşkun");
        customerEJB.createCustomer(customer);
        customerEJB.deleteCustomer(1L);
        Customer foundCustomer = customerEJB.findCustomerById(1L);
        assertNull(foundCustomer);
    }
}
