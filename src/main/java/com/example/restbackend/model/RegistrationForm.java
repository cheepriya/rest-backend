package com.example.restbackend.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.cglib.core.Local;

import java.util.Date;


@Entity
@Table(name="registration_page")
public class RegistrationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="fullName")
    private String fullName;
    @Column(name="dob")
    private Date dob;
    @Column(name="address")
    private String address;
    @Column(name="eir")
    private String eir;
    @Column(name="email")
    private String email;
    @Column(name="mobile_Number")
    private Integer mobile_Number;
    @Column(name="medical_Card_Number")
    private Integer medical_Card_Number;
    @Column(name="ppsn")
    private String ppsn;
    @Column(name="previous_GP_Name_and_address")
    private String previous_GP_Name_and_address;
    @Column(name="enableNotification")
    private String enableNotification;


    public RegistrationForm() {
    }


    public RegistrationForm(Long id, String fullName, Date dob, String address, String eir, String email, Integer mobile_Number, Integer medical_Card_Number, String ppsn, String previous_GP_Name_and_address, String enableNotification) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.eir = eir;
        this.email = email;
        this.mobile_Number = mobile_Number;
        this.medical_Card_Number = medical_Card_Number;
        this.ppsn = ppsn;
        this.previous_GP_Name_and_address = previous_GP_Name_and_address;
        this.enableNotification = enableNotification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getdob() {
        return dob;
    }

    public void setdob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String geteir() {
        return eir;
    }

    public void seteir(String eir) {

        this.eir = eir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobile_Number() {
        return mobile_Number;
    }

    public void setMobile_Number(Integer mobile_Number) {
        this.mobile_Number = mobile_Number;
    }

    public Integer getMedical_Card_Number() {
        return medical_Card_Number;
    }

    public void setMedical_Card_Number(Integer medical_Card_Number) {
        this.medical_Card_Number = medical_Card_Number;
    }

    public String getppsn() {
        return ppsn;
    }

    public void setppsn(String ppsn) {
        this.ppsn = ppsn;
    }

    public String getPrevious_GP_Name_and_address() {
        return previous_GP_Name_and_address;
    }

    public void setPrevious_GP_Name_and_address(String previous_GP_Name_and_address) {
        this.previous_GP_Name_and_address = previous_GP_Name_and_address;
    }

    public String getEnableNotification() {
        return enableNotification;
    }

    public void setEnableNotification(String enableNotification) {
        this.enableNotification = enableNotification;
    }

}