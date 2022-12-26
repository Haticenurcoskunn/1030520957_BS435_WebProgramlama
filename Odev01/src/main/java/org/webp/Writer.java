package org.webp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Table(name = "Writer")
@Entity
public class Writer {

    @Id
    @NotNull
    private Long writerId;

    @Column(name = "writer_name")
    private String writerName;

    @Column(name = "customer_id")
    private Long customerId;

    public Writer(){}

    public Long getId() {
        return writerId;
    }

    public void setId(Long writerId) {
        this.writerId = writerId;
    }

    public String getName() {
        return writerName;
    }

    public void setName(String writerName) {
        this.writerName = writerName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}

