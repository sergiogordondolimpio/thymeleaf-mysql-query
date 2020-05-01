package com.gordon.thymeleafmysqlquery.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;


@Entity
@Table(name = "children", schema = "taller_infantil_miramar")
public class Children {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private Integer dni;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String birthday;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String inscription;
    @Column
    private String sex;
    @Column
    private String regular;
    @Column
    private String plan;
    @Column
    private Integer id_whowithdraw;

    public Children() {
    }

    @Override
    public String toString() {
        return "Children{" +
                "id=" + id +
                ", dni=" + dni +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", inscription='" + inscription + '\'' +
                ", sex='" + sex + '\'' +
                ", regular='" + regular + '\'' +
                ", plan=" + plan +
                ", id_whowithdraw=" + id_whowithdraw +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getInscription() {
        return inscription;
    }

    public void setInscription(String inscription) {
        this.inscription = inscription;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegular() {
        return regular;
    }

    public void setRegular(String regular) {
        this.regular = regular;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Integer getId_whowithdraw() {
        return id_whowithdraw;
    }

    public void setId_whowithdraw(Integer id_whowithdraw) {
        this.id_whowithdraw = id_whowithdraw;
    }
}