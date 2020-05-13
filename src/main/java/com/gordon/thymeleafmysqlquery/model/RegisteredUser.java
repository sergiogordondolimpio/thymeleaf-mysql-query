package com.gordon.thymeleafmysqlquery.model;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users", schema = "taller_infantil_miramar")
public class RegisteredUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    @NotEmpty(message = "This field can not be empty")
    private String name;
    @Column
    @NotEmpty(message = "This field can not be empty")
    private String surname;
    @Column
    @NotEmpty(message = "This field can not be empty")
    private String pass;
    @Column
    private int dni;
    @Column(unique = true)
    @NotEmpty(message = "This field can not be empty")
    @Email(message = "It is not a format for email, example: mail@mail.com")
    private String email;

    public RegisteredUser() {
    }

    public RegisteredUser(int id, String name, String surname, String pass, int dni, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pass = pass;
        this.dni = dni;
        this.email = email;
    }

    @Override
    public String toString() {
        return "RegisteredUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pass='" + pass + '\'' +
                ", dni=" + dni +
                ", email='" + email + '\'' +
                '}';
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
