package org.webp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Table(name = "SellerCompany")
@Entity
public class SellerCompany {

    @Id
    @NotNull
    private Long sellerCompanyId;

    @Column(name = "sellerCompany_name")
    private String sellerCompanyName;

    @Column(name = "customer_id")
    private Long customerId;

    public SellerCompany(){}

    public Long getId() {
        return sellerCompanyId;
    }

    public void setId(Long sellerCompanyId) {
        this.sellerCompanyId = sellerCompanyId;
    }

    public String getName() {
        return sellerCompanyName;
    }

    public void setName(String sellerCompany) {
        this.sellerCompanyName = sellerCompanyName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
