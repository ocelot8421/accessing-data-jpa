package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity, indicating that it is a JPA entity. (Because no @Table annotation exists, it is assumed that this entity is mapped to a table named Customer.)
@Entity
public class Customer {

    // @Id so that JPA recognizes it as the object’s ID.
    @Id
    // @GeneratedValue to indicate that the ID should be generated automatically.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // unannotated. It is assumed that they are mapped to columns that share the same names as the properties themselves.
    private String firstName;
    private String lastName;

    protected Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastNAme='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
