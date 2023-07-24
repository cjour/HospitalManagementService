package com.medhead.hospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "pathologies")
public class Pathology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="pathologies")
    private String name;

    public Pathology(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pathology() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String pathologies) {
        this.name = pathologies;
    }

    @Override
    public String toString() {
        return "Pathology{" +
                "id=" + id +
                ", pathologies='" + name + '\'' +
                '}';
    }
}
