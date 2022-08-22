package com.fazlaejderhasiolanvarmi.rest.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "formula", name = "teams")
public class Team {

    @Id
    @GeneratedValue(generator = "uuid4")
    @GenericGenerator(name = "uuid4", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column
    private String name;

    @OneToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="first_driver", nullable=false)
    private Driver firstDriver;

    @OneToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="second_driver", nullable=false)
    private Driver secondDriver;

    @Column
    private double points;

    public Team(UUID id, String name, Driver firstDriver, Driver secondDriver, double points) {
        this.id = id;
        this.name = name;
        this.firstDriver = firstDriver;
        this.secondDriver = secondDriver;
        this.points = points;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getFirstDriver() {
        return firstDriver;
    }

    public void setFirstDriver(Driver firstDriver) {
        this.firstDriver = firstDriver;
    }

    public Driver getSecondDriver() {
        return secondDriver;
    }

    public void setSecondDriver(Driver secondDriver) {
        this.secondDriver = secondDriver;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

}
