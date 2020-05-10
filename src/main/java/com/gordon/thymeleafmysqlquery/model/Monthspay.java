package com.gordon.thymeleafmysqlquery.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Monthspay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotEmpty
    private int id_months_pay;
    @Column
    @NotEmpty
    private String month;
    @Column
    @NotEmpty
    private String payOk;
    @Column
    @NotEmpty
    private int year;
    @Column
    @NotEmpty
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String day_pay;
    @Column
    @NotEmpty
    private int id_children;

    /*
    * in video use this in replace of id_children
    * @ManyToOne
    * @JoinColumn(name="CHILDREN_ID")
    * private Children children
    * */

    public Monthspay() {
    }

    public Monthspay(String month, String payOk, int year, String day_pay) {
        this.month = month;
        this.payOk = payOk;
        this.year = year;
        this.day_pay = day_pay;
    }

    @Override
    public String toString() {
        return "Monthspay{" +
                "id_months_pay=" + id_months_pay +
                ", month='" + month + '\'' +
                ", payOk='" + payOk + '\'' +
                ", year=" + year +
                ", day_pay='" + day_pay + '\'' +
                ", id_children=" + id_children +
                '}';
    }

    public int getId_months_pay() {
        return id_months_pay;
    }

    public void setId_months_pay(int id_months_pay) {
        this.id_months_pay = id_months_pay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPayOk() {
        return payOk;
    }

    public void setPayOk(String payOk) {
        this.payOk = payOk;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDay_pay() {
        return day_pay;
    }

    public void setDay_pay(String day_pay) {
        this.day_pay = day_pay;
    }

    public int getId_children() {
        return id_children;
    }

    public void setId_children(int id_children) {
        this.id_children = id_children;
    }
}
