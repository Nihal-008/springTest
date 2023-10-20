package com.vaccination.projectTest.modelM;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usersv")
public class User {
    @Column
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    public User() {
    }
    private String name;
   private String contact;
    private String vaccine;
    private String idtype;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getVaccine() {
        return vaccine;
    }
    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }
    public String getIdtype() {
        return idtype;
    }
    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    
     @Override
    public String toString() {
        return "User [name=" + name + ", contact=" + contact + ", vaccine=" + vaccine + ", idtype=" + idtype + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
