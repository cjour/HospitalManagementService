package com.medhead.hospital.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="OrganisationName")
    private String organisationName;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String county;
    @Column(name="PostCode")
    private String postCode;
    private String latitude;
    private String longitude;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "hospital_id")
    private List<Pathology> pathologies;

    public Hospital(
            Integer id,
            String organisationName,
            String address1,
            String address2,
            String address3,
            String city,
            String county,
            String postCode,
            String latitude,
            String longitude,
            List<Pathology> pathologies
    ) {
        this.id = id;
        this.organisationName = organisationName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.county = county;
        this.postCode = postCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.pathologies = pathologies;
    }

    public Hospital() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<Pathology> getPathologies() {
        return pathologies;
    }

    public void setPathologies(List<Pathology> pathologies) {
        this.pathologies = pathologies;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", organisationName='" + organisationName + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postCode='" + postCode + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                // ", pathologies=" + pathologies +
                '}';
    }
}
