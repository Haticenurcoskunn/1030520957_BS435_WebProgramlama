package org.webp;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Table(name = "Book")
@Entity
public class Book {

    @NotNull
    @Column(name = "book_id", nullable = false)
    @Id
    private Long bookId;

    @Column(name = "book_name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private int price;

    @Column(name = "sellerCompany_id")
    private Long sellerCompanyId;



    public Book(){}

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getSellerCompanyId() {return sellerCompanyId;}

    public void setSellerCompanyId(Long sellerCompanyId) {
        this.sellerCompanyId = sellerCompanyId;
    }
}
