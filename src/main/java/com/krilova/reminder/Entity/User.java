package com.krilova.reminder.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.math.BigInteger;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private char email;
    @Column(name = "telegram")
    private char telegram;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && email == user.email && telegram == user.telegram && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, telegram);
    }



    public User(int id, String name, char email, char telegram) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telegram = telegram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getTelegram() {
        return telegram;
    }

    public void setTelegram(char telegram) {
        this.telegram = telegram;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", telegram=" + telegram +
                '}';
    }
}
