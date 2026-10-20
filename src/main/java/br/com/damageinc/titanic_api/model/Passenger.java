package br.com.damageinc.titanic_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger {

    @Id
    private Long passengerId;

    private Integer survived;

    private Integer pclass;

    private String name;

    private String sex;

    private Double age;

    private Integer sibSp;

    private Integer parch;

    private String ticket;

    private BigDecimal fare;

    private String cabin;

    private String embarked;

    protected Passenger(){}

    public Passenger(
        Long passengerId,
        Integer survived,
        Integer pclass,
        String name,
        String sex,
        Double age,
        Integer sibSp,
        Integer parch,
        String ticket,
        BigDecimal fare,
        String cabin,
        String embarked) {

    this.passengerId = passengerId;
    this.survived = survived;
    this.pclass = pclass;
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.sibSp = sibSp;
    this.parch = parch;
    this.ticket = ticket;
    this.fare = fare;
    this.cabin = cabin;
    this.embarked = embarked;
}
}