package com.example.restbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;


@Entity
public class RegistrationForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String fullName;
    private Date DOB;

    private String address;

    private String EIR_Code;

    private String email;

    private int mobile_Number;


    private int medical_Card_Number;

    private int PPSN_Number;
    ;
    private String previous_GP_Name_and_address;

    public RegistrationForm(Long id, String fullName, Date DOB, String address, String EIR_Code, String email, int mobile_Number, int medical_Card_Number, int PPSN_Number, String previous_GP_Name_and_address) {
        this.id = id;
        this.fullName = fullName;
        this.DOB = DOB;
        this.address = address;
        this.EIR_Code = EIR_Code;
        this.email = email;
        this.mobile_Number = mobile_Number;
        this.medical_Card_Number = medical_Card_Number;
        this.PPSN_Number = PPSN_Number;
        this.previous_GP_Name_and_address = previous_GP_Name_and_address;

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

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEIR_Code() {
        return EIR_Code;
    }

    public void setEIR_Code(String EIR_Code) {
        this.EIR_Code = EIR_Code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile_Number() {
        return mobile_Number;
    }

    public void setMobile_Number(int mobile_Number) {
        this.mobile_Number = mobile_Number;
    }

    public int getMedical_Card_Number() {
        return medical_Card_Number;
    }

    public void setMedical_Card_Number(int medical_Card_Number) {
        this.medical_Card_Number = medical_Card_Number;
    }

    public int getPPSN_Number() {
        return PPSN_Number;
    }

    public void setPPSN_Number(int PPSN_Number) {
        this.PPSN_Number = PPSN_Number;
    }

    public String getPrevious_GP_Name_and_address() {
        return previous_GP_Name_and_address;
    }

    public void setPrevious_GP_Name_and_address(String previous_GP_Name_and_address) {
        this.previous_GP_Name_and_address = previous_GP_Name_and_address;
    }
}