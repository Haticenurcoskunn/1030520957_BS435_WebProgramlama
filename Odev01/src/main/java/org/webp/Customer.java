package org.webp;

import javax.persistence.*;

@Table(name = "Customer")
@Entity
public class Customer {
    @Id
    @Column(name = "customer_ıd", nullable = false)
    private Long customerId;

    @Column(name = "customer_name")
    private String name;


    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
