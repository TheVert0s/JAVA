package com.example.FriendProject.domain.friend;

import org.hibernate.boot.model.source.spi.IdentifierSource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private String firstName;
    private String lastName;
    private  int age;
    private  String descryption;

    public  Friend(){};

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }

    public Friend(String firstName, String lastName, int age, String descryption) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.descryption = descryption;
    }

}