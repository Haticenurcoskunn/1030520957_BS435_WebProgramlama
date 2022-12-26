package org.webp;

import javax.persistence.*;

@Table(name = "Customer")
@Entity
public class Customer {
    @Id
    @Column(name = "customer_ıd", nullable = false)
    private Long publisherId;

    @Column(name = "customer_name")
    private String name;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long publisherId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
